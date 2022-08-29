package com._6OperatorPrecedance;

/* while calculation there are 2 things are important
    1.Precedence --> *,/,+,- in order
    2.Associativity --> left to right, right to left
*/

public class OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println("-------Precedence of operator-----");
        int a = 6*5-34/2;// its calculate like
        /*
           = 30 - 34/2;
           = 30 - 17
           = 13
         */
        System.out.println(a);
    }
}


/*
.	Direct member selection	Left to right
->	Indirect member selection	Left to right
[]	Array element reference	Left to right
()	Functional call	Left to right
~	Bitwise(1’s) complement	Right to left
!	Logical negation	Right to left
–	Unary minus	Right to left
+	Unary plus	Right to left
—	Decrement	Right to left
++	Increment	Right to left
*	Pointer reference	Right to left
&	Dereference (Address)	Right to left
(type)	Typecast (conversion)	Right to left
sizeof	Returns the size of an object	Right to left
%	Remainder	Left to right
/	Divide	Left to right
*	Multiply	Left to right
–	Binary minus (subtraction)	Left to right
+	Binary plus (Addition)	Left to right
>>	Right shift	Left to right
<<	Left shift	Left to right
>	Greater than	Left to right
<	Less than	Left to right
>=	Greater than or equal	Left to right
<=	Less than or equal	Left to right
==	Equal to	Left to right
!=	Not equal to	Left to right
^	Bitwise exclusive OR	Left to right
&	Bitwise AND	Left to right
||	Logical OR	Left to right
|	Bitwise OR	Left to right
?:	Conditional Operator	Right to left
&&	Logical AND	Left to right
,	Separator of expressions	Left to right
=	Simple assignment	Right to left
/=	Assign quotient	Right to left
*=	Assign product	Right to left
%=	Assign remainder	Right to left
-=	Assign difference	Right to left
+=	Assign sum	Right to left
|=	Assign bitwise OR	Right to left
^=	Assign bitwise XOR	Right to left
&=	Assign bitwise AND	Right to left
>>=	Assign right shift	Right to left
<<=	Assign left shift	Right to left
*/