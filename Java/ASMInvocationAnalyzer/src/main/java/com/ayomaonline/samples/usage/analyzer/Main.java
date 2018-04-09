package com.ayomaonline.samples.usage.analyzer;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.io.IOException;

public class Main {
    public static void main( String[] args ) throws IOException {
        ClassReader reader = new ClassReader("java.lang.Integer");
        ClassVisitor cv = new DummyClassVisitor();

        reader.accept(cv, 0);
    }

    static class InvocationVisitor extends MethodVisitor {
        public InvocationVisitor() {
            super(Opcodes.ASM5);
        }

        public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
            super.visitMethodInsn(opcode, owner, name, desc, itf);
            System.out.println("     " + owner + " "+ name + " - " + desc);
        }
    }

    static class DummyClassVisitor extends ClassVisitor {
        private InvocationVisitor mv = new InvocationVisitor();
        private String className;

        public DummyClassVisitor() {
            super(Opcodes.ASM5);
        }

        public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
            className = name;
        }

        public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
            System.out.println(className + " " + name  + " " + desc);
            return mv;
        }
    }
}