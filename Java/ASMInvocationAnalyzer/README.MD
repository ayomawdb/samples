Sample will print all the methods available within "java/lang/String" class and prints all the invocations done within the method. 

First line reads: 

"init" method (constructor) of "java/lang/String" calls "init" method (constructor) of "java/lang/Object" with no arguments. 

Example output is as follows. 

```
java/lang/String <init> ()V
     java/lang/Object <init> - ()V
java/lang/String <init> (Ljava/lang/String;)V
     java/lang/Object <init> - ()V
java/lang/String <init> ([C)V
     java/lang/Object <init> - ()V
     java/util/Arrays copyOf - ([CI)[C
java/lang/String <init> ([CII)V
     java/lang/Object <init> - ()V
     java/lang/StringIndexOutOfBoundsException <init> - (I)V
     java/lang/StringIndexOutOfBoundsException <init> - (I)V
     java/lang/StringIndexOutOfBoundsException <init> - (I)V
     java/util/Arrays copyOfRange - ([CII)[C
java/lang/String <init> ([III)V
     java/lang/Object <init> - ()V
     java/lang/StringIndexOutOfBoundsException <init> - (I)V
     java/lang/StringIndexOutOfBoundsException <init> - (I)V
     java/lang/StringIndexOutOfBoundsException <init> - (I)V
     java/lang/Character isBmpCodePoint - (I)Z
     java/lang/Character isValidCodePoint - (I)Z
     java/lang/Integer toString - (I)Ljava/lang/String;
     java/lang/IllegalArgumentException <init> - (Ljava/lang/String;)V
     java/lang/Character isBmpCodePoint - (I)Z
     java/lang/Character toSurrogates - (I[CI)V
java/lang/String <init> ([BIII)V
     java/lang/Object <init> - ()V
     java/lang/String checkBounds - ([BII)V
java/lang/String <init> ([BI)V
     java/lang/String <init> - ([BIII)V
java/lang/String checkBounds ([BII)V
     java/lang/StringIndexOutOfBoundsException <init> - (I)V
     java/lang/StringIndexOutOfBoundsException <init> - (I)V
     java/lang/StringIndexOutOfBoundsException <init> - (I)V
java/lang/String <init> ([BIILjava/lang/String;)V
     java/lang/Object <init> - ()V
     java/lang/NullPointerException <init> - (Ljava/lang/String;)V
     java/lang/String checkBounds - ([BII)V
     java/lang/StringCoding decode - (Ljava/lang/String;[BII)[C
java/lang/String <init> ([BIILjava/nio/charset/Charset;)V
     java/lang/Object <init> - ()V
     java/lang/NullPointerException <init> - (Ljava/lang/String;)V
     java/lang/String checkBounds - ([BII)V
     java/lang/StringCoding decode - (Ljava/nio/charset/Charset;[BII)[C
java/lang/String <init> ([BLjava/lang/String;)V
     java/lang/String <init> - ([BIILjava/lang/String;)V
java/lang/String <init> ([BLjava/nio/charset/Charset;)V
     java/lang/String <init> - ([BIILjava/nio/charset/Charset;)V
java/lang/String <init> ([BII)V
     java/lang/Object <init> - ()V
     java/lang/String checkBounds - ([BII)V
     java/lang/StringCoding decode - ([BII)[C
java/lang/String <init> ([B)V
     java/lang/String <init> - ([BII)V
java/lang/String <init> (Ljava/lang/StringBuffer;)V
     java/lang/Object <init> - ()V
     java/lang/StringBuffer getValue - ()[C
     java/lang/StringBuffer length - ()I
     java/util/Arrays copyOf - ([CI)[C
java/lang/String <init> (Ljava/lang/StringBuilder;)V
     java/lang/Object <init> - ()V
     java/lang/StringBuilder getValue - ()[C
     java/lang/StringBuilder length - ()I
     java/util/Arrays copyOf - ([CI)[C
java/lang/String <init> ([CZ)V
     java/lang/Object <init> - ()V
java/lang/String length ()I
java/lang/String isEmpty ()Z
java/lang/String charAt (I)C
     java/lang/StringIndexOutOfBoundsException <init> - (I)V
java/lang/String codePointAt (I)I
     java/lang/StringIndexOutOfBoundsException <init> - (I)V
     java/lang/Character codePointAtImpl - ([CII)I
java/lang/String codePointBefore (I)I
     java/lang/StringIndexOutOfBoundsException <init> - (I)V
     java/lang/Character codePointBeforeImpl - ([CII)I
java/lang/String codePointCount (II)I
     java/lang/IndexOutOfBoundsException <init> - ()V
     java/lang/Character codePointCountImpl - ([CII)I
java/lang/String offsetByCodePoints (II)I
     java/lang/IndexOutOfBoundsException <init> - ()V
     java/lang/Character offsetByCodePointsImpl - ([CIIII)I
java/lang/String getChars ([CI)V
     java/lang/System arraycopy - (Ljava/lang/Object;ILjava/lang/Object;II)V
java/lang/String getChars (II[CI)V
     java/lang/StringIndexOutOfBoundsException <init> - (I)V
     java/lang/StringIndexOutOfBoundsException <init> - (I)V
     java/lang/StringIndexOutOfBoundsException <init> - (I)V
     java/lang/System arraycopy - (Ljava/lang/Object;ILjava/lang/Object;II)V
java/lang/String getBytes (II[BI)V
     java/lang/StringIndexOutOfBoundsException <init> - (I)V
     java/lang/StringIndexOutOfBoundsException <init> - (I)V
     java/lang/StringIndexOutOfBoundsException <init> - (I)V
     java/util/Objects requireNonNull - (Ljava/lang/Object;)Ljava/lang/Object;
java/lang/String getBytes (Ljava/lang/String;)[B
     java/lang/NullPointerException <init> - ()V
     java/lang/StringCoding encode - (Ljava/lang/String;[CII)[B
java/lang/String getBytes (Ljava/nio/charset/Charset;)[B
     java/lang/NullPointerException <init> - ()V
     java/lang/StringCoding encode - (Ljava/nio/charset/Charset;[CII)[B
java/lang/String getBytes ()[B
     java/lang/StringCoding encode - ([CII)[B
java/lang/String equals (Ljava/lang/Object;)Z
java/lang/String contentEquals (Ljava/lang/StringBuffer;)Z
     java/lang/String contentEquals - (Ljava/lang/CharSequence;)Z
java/lang/String nonSyncContentEquals (Ljava/lang/AbstractStringBuilder;)Z
     java/lang/AbstractStringBuilder getValue - ()[C
     java/lang/AbstractStringBuilder length - ()I
java/lang/String contentEquals (Ljava/lang/CharSequence;)Z
     java/lang/String nonSyncContentEquals - (Ljava/lang/AbstractStringBuilder;)Z
     java/lang/String nonSyncContentEquals - (Ljava/lang/AbstractStringBuilder;)Z
     java/lang/String equals - (Ljava/lang/Object;)Z
     java/lang/CharSequence length - ()I
     java/lang/CharSequence charAt - (I)C
java/lang/String equalsIgnoreCase (Ljava/lang/String;)Z
     java/lang/String regionMatches - (ZILjava/lang/String;II)Z
java/lang/String compareTo (Ljava/lang/String;)I
     java/lang/Math min - (II)I
java/lang/String compareToIgnoreCase (Ljava/lang/String;)I
     java/util/Comparator compare - (Ljava/lang/Object;Ljava/lang/Object;)I
java/lang/String regionMatches (ILjava/lang/String;II)Z
java/lang/String regionMatches (ZILjava/lang/String;II)Z
     java/lang/Character toUpperCase - (C)C
     java/lang/Character toUpperCase - (C)C
     java/lang/Character toLowerCase - (C)C
     java/lang/Character toLowerCase - (C)C
java/lang/String startsWith (Ljava/lang/String;I)Z
java/lang/String startsWith (Ljava/lang/String;)Z
     java/lang/String startsWith - (Ljava/lang/String;I)Z
java/lang/String endsWith (Ljava/lang/String;)Z
     java/lang/String startsWith - (Ljava/lang/String;I)Z
java/lang/String hashCode ()I
java/lang/String indexOf (I)I
     java/lang/String indexOf - (II)I
java/lang/String indexOf (II)I
     java/lang/String indexOfSupplementary - (II)I
java/lang/String indexOfSupplementary (II)I
     java/lang/Character isValidCodePoint - (I)Z
     java/lang/Character highSurrogate - (I)C
     java/lang/Character lowSurrogate - (I)C
java/lang/String lastIndexOf (I)I
     java/lang/String lastIndexOf - (II)I
java/lang/String lastIndexOf (II)I
     java/lang/Math min - (II)I
     java/lang/String lastIndexOfSupplementary - (II)I
java/lang/String lastIndexOfSupplementary (II)I
     java/lang/Character isValidCodePoint - (I)Z
     java/lang/Character highSurrogate - (I)C
     java/lang/Character lowSurrogate - (I)C
     java/lang/Math min - (II)I
java/lang/String indexOf (Ljava/lang/String;)I
     java/lang/String indexOf - (Ljava/lang/String;I)I
java/lang/String indexOf (Ljava/lang/String;I)I
     java/lang/String indexOf - ([CII[CIII)I
java/lang/String indexOf ([CIILjava/lang/String;I)I
     java/lang/String indexOf - ([CII[CIII)I
java/lang/String indexOf ([CII[CIII)I
java/lang/String lastIndexOf (Ljava/lang/String;)I
     java/lang/String lastIndexOf - (Ljava/lang/String;I)I
java/lang/String lastIndexOf (Ljava/lang/String;I)I
     java/lang/String lastIndexOf - ([CII[CIII)I
java/lang/String lastIndexOf ([CIILjava/lang/String;I)I
     java/lang/String lastIndexOf - ([CII[CIII)I
java/lang/String lastIndexOf ([CII[CIII)I
java/lang/String substring (I)Ljava/lang/String;
     java/lang/StringIndexOutOfBoundsException <init> - (I)V
     java/lang/StringIndexOutOfBoundsException <init> - (I)V
     java/lang/String <init> - ([CII)V
java/lang/String substring (II)Ljava/lang/String;
     java/lang/StringIndexOutOfBoundsException <init> - (I)V
     java/lang/StringIndexOutOfBoundsException <init> - (I)V
     java/lang/StringIndexOutOfBoundsException <init> - (I)V
     java/lang/String <init> - ([CII)V
java/lang/String subSequence (II)Ljava/lang/CharSequence;
     java/lang/String substring - (II)Ljava/lang/String;
java/lang/String concat (Ljava/lang/String;)Ljava/lang/String;
     java/lang/String length - ()I
     java/util/Arrays copyOf - ([CI)[C
     java/lang/String getChars - ([CI)V
     java/lang/String <init> - ([CZ)V
java/lang/String replace (CC)Ljava/lang/String;
     java/lang/String <init> - ([CZ)V
java/lang/String matches (Ljava/lang/String;)Z
     java/util/regex/Pattern matches - (Ljava/lang/String;Ljava/lang/CharSequence;)Z
java/lang/String contains (Ljava/lang/CharSequence;)Z
     java/lang/CharSequence toString - ()Ljava/lang/String;
     java/lang/String indexOf - (Ljava/lang/String;)I
java/lang/String replaceFirst (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
     java/util/regex/Pattern compile - (Ljava/lang/String;)Ljava/util/regex/Pattern;
     java/util/regex/Pattern matcher - (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
     java/util/regex/Matcher replaceFirst - (Ljava/lang/String;)Ljava/lang/String;
java/lang/String replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
     java/util/regex/Pattern compile - (Ljava/lang/String;)Ljava/util/regex/Pattern;
     java/util/regex/Pattern matcher - (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
     java/util/regex/Matcher replaceAll - (Ljava/lang/String;)Ljava/lang/String;
java/lang/String replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
     java/lang/CharSequence toString - ()Ljava/lang/String;
     java/util/regex/Pattern compile - (Ljava/lang/String;I)Ljava/util/regex/Pattern;
     java/util/regex/Pattern matcher - (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
     java/lang/CharSequence toString - ()Ljava/lang/String;
     java/util/regex/Matcher quoteReplacement - (Ljava/lang/String;)Ljava/lang/String;
     java/util/regex/Matcher replaceAll - (Ljava/lang/String;)Ljava/lang/String;
java/lang/String split (Ljava/lang/String;I)[Ljava/lang/String;
     java/lang/String charAt - (I)C
     java/lang/String indexOf - (I)I
     java/lang/String length - ()I
     java/lang/String charAt - (I)C
     java/lang/String charAt - (I)C
     java/util/ArrayList <init> - ()V
     java/lang/String indexOf - (II)I
     java/util/ArrayList size - ()I
     java/lang/String substring - (II)Ljava/lang/String;
     java/util/ArrayList add - (Ljava/lang/Object;)Z
     java/lang/String substring - (II)Ljava/lang/String;
     java/util/ArrayList add - (Ljava/lang/Object;)Z
     java/util/ArrayList size - ()I
     java/lang/String substring - (II)Ljava/lang/String;
     java/util/ArrayList add - (Ljava/lang/Object;)Z
     java/util/ArrayList size - ()I
     java/util/ArrayList get - (I)Ljava/lang/Object;
     java/lang/String length - ()I
     java/util/ArrayList subList - (II)Ljava/util/List;
     java/util/List toArray - ([Ljava/lang/Object;)[Ljava/lang/Object;
     java/util/regex/Pattern compile - (Ljava/lang/String;)Ljava/util/regex/Pattern;
     java/util/regex/Pattern split - (Ljava/lang/CharSequence;I)[Ljava/lang/String;
java/lang/String split (Ljava/lang/String;)[Ljava/lang/String;
     java/lang/String split - (Ljava/lang/String;I)[Ljava/lang/String;
java/lang/String join (Ljava/lang/CharSequence;[Ljava/lang/CharSequence;)Ljava/lang/String;
     java/util/Objects requireNonNull - (Ljava/lang/Object;)Ljava/lang/Object;
     java/util/Objects requireNonNull - (Ljava/lang/Object;)Ljava/lang/Object;
     java/util/StringJoiner <init> - (Ljava/lang/CharSequence;)V
     java/util/StringJoiner add - (Ljava/lang/CharSequence;)Ljava/util/StringJoiner;
     java/util/StringJoiner toString - ()Ljava/lang/String;
java/lang/String join (Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
     java/util/Objects requireNonNull - (Ljava/lang/Object;)Ljava/lang/Object;
     java/util/Objects requireNonNull - (Ljava/lang/Object;)Ljava/lang/Object;
     java/util/StringJoiner <init> - (Ljava/lang/CharSequence;)V
     java/lang/Iterable iterator - ()Ljava/util/Iterator;
     java/util/Iterator hasNext - ()Z
     java/util/Iterator next - ()Ljava/lang/Object;
     java/util/StringJoiner add - (Ljava/lang/CharSequence;)Ljava/util/StringJoiner;
     java/util/StringJoiner toString - ()Ljava/lang/String;
java/lang/String toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
     java/lang/NullPointerException <init> - ()V
     java/lang/String codePointAt - (I)I
     java/lang/Character toLowerCase - (I)I
     java/lang/Character charCount - (I)I
     java/lang/Character toLowerCase - (C)C
     java/lang/System arraycopy - (Ljava/lang/Object;ILjava/lang/Object;II)V
     java/util/Locale getLanguage - ()Ljava/lang/String;
     java/lang/String codePointAt - (I)I
     java/lang/Character charCount - (I)I
     java/lang/ConditionalSpecialCasing toLowerCaseEx - (Ljava/lang/String;ILjava/util/Locale;)I
     java/lang/Character toLowerCase - (I)I
     java/lang/ConditionalSpecialCasing toLowerCaseCharArray - (Ljava/lang/String;ILjava/util/Locale;)[C
     java/lang/Character toChars - (I[CI)I
     java/lang/Character toChars - (I)[C
     java/lang/System arraycopy - (Ljava/lang/Object;ILjava/lang/Object;II)V
     java/lang/String <init> - ([CII)V
java/lang/String toLowerCase ()Ljava/lang/String;
     java/util/Locale getDefault - ()Ljava/util/Locale;
     java/lang/String toLowerCase - (Ljava/util/Locale;)Ljava/lang/String;
java/lang/String toUpperCase (Ljava/util/Locale;)Ljava/lang/String;
     java/lang/NullPointerException <init> - ()V
     java/lang/String codePointAt - (I)I
     java/lang/Character charCount - (I)I
     java/lang/Character toUpperCaseEx - (I)I
     java/lang/System arraycopy - (Ljava/lang/Object;ILjava/lang/Object;II)V
     java/util/Locale getLanguage - ()Ljava/lang/String;
     java/lang/String codePointAt - (I)I
     java/lang/Character charCount - (I)I
     java/lang/ConditionalSpecialCasing toUpperCaseEx - (Ljava/lang/String;ILjava/util/Locale;)I
     java/lang/Character toUpperCaseEx - (I)I
     java/lang/ConditionalSpecialCasing toUpperCaseCharArray - (Ljava/lang/String;ILjava/util/Locale;)[C
     java/lang/Character toUpperCaseCharArray - (I)[C
     java/lang/Character toChars - (I[CI)I
     java/lang/Character toChars - (I)[C
     java/lang/System arraycopy - (Ljava/lang/Object;ILjava/lang/Object;II)V
     java/lang/String <init> - ([CII)V
java/lang/String toUpperCase ()Ljava/lang/String;
     java/util/Locale getDefault - ()Ljava/util/Locale;
     java/lang/String toUpperCase - (Ljava/util/Locale;)Ljava/lang/String;
java/lang/String trim ()Ljava/lang/String;
     java/lang/String substring - (II)Ljava/lang/String;
java/lang/String toString ()Ljava/lang/String;
java/lang/String toCharArray ()[C
     java/lang/System arraycopy - (Ljava/lang/Object;ILjava/lang/Object;II)V
java/lang/String format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
     java/util/Formatter <init> - ()V
     java/util/Formatter format - (Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
     java/util/Formatter toString - ()Ljava/lang/String;
java/lang/String format (Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
     java/util/Formatter <init> - (Ljava/util/Locale;)V
     java/util/Formatter format - (Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
     java/util/Formatter toString - ()Ljava/lang/String;
java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
     java/lang/Object toString - ()Ljava/lang/String;
java/lang/String valueOf ([C)Ljava/lang/String;
     java/lang/String <init> - ([C)V
java/lang/String valueOf ([CII)Ljava/lang/String;
     java/lang/String <init> - ([CII)V
java/lang/String copyValueOf ([CII)Ljava/lang/String;
     java/lang/String <init> - ([CII)V
java/lang/String copyValueOf ([C)Ljava/lang/String;
     java/lang/String <init> - ([C)V
java/lang/String valueOf (Z)Ljava/lang/String;
java/lang/String valueOf (C)Ljava/lang/String;
     java/lang/String <init> - ([CZ)V
java/lang/String valueOf (I)Ljava/lang/String;
     java/lang/Integer toString - (I)Ljava/lang/String;
java/lang/String valueOf (J)Ljava/lang/String;
     java/lang/Long toString - (J)Ljava/lang/String;
java/lang/String valueOf (F)Ljava/lang/String;
     java/lang/Float toString - (F)Ljava/lang/String;
java/lang/String valueOf (D)Ljava/lang/String;
     java/lang/Double toString - (D)Ljava/lang/String;
java/lang/String intern ()Ljava/lang/String;
java/lang/String compareTo (Ljava/lang/Object;)I
     java/lang/String compareTo - (Ljava/lang/String;)I
java/lang/String <clinit> ()V
     java/lang/String$CaseInsensitiveComparator <init> - (Ljava/lang/String$1;)V
```
