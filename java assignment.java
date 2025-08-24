{\rtf1\ansi\ansicpg1252\cocoartf2822
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red70\green137\blue204;\red0\green0\blue0;\red193\green193\blue193;
\red67\green192\blue160;\red202\green202\blue202;\red212\green214\blue154;\red140\green211\blue254;\red183\green111\blue179;
\red66\green179\blue255;\red194\green126\blue101;\red167\green197\blue152;}
{\*\expandedcolortbl;;\cssrgb\c33725\c61176\c83922;\csgray\c0\c0;\cssrgb\c80000\c80000\c80000;
\cssrgb\c30588\c78824\c69020;\cssrgb\c83137\c83137\c83137;\cssrgb\c86275\c86275\c66667;\cssrgb\c61176\c86275\c99608;\cssrgb\c77255\c52549\c75294;
\cssrgb\c30980\c75686\c100000;\cssrgb\c80784\c56863\c47059;\cssrgb\c70980\c80784\c65882;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Java Assignment\
Name - Dany\
Sap ID - 590028232\
Batch - 2\
\
1.\
import\cf4 \strokec4  \cf5 \strokec5 java\cf6 \strokec6 .\cf5 \strokec5 util\cf6 \strokec6 .\cf5 \strokec5 Scanner\cf4 \strokec4 ;\
\cf2 \strokec2 public\cf4 \strokec4  \cf2 \strokec2 class\cf4 \strokec4  \cf5 \strokec5 arthOperators\cf4 \strokec4 \{\
    \cf2 \strokec2 public\cf4 \strokec4  \cf2 \strokec2 static\cf4 \strokec4  \cf5 \strokec5 void\cf4 \strokec4  \cf7 \strokec7 main\cf4 \strokec4 (\cf5 \strokec5 String\cf4 \strokec4  \cf8 \strokec8 args\cf4 \strokec4 [ ] )\{\
        \cf5 \strokec5 Scanner\cf4 \strokec4  \cf8 \strokec8 sc\cf4 \strokec4  \cf6 \strokec6 =\cf4 \strokec4  \cf9 \strokec9 new\cf4 \strokec4  \cf7 \strokec7 Scanner\cf4 \strokec4 (\cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 in\cf4 \strokec4 );\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "Enter the 1st number : "\cf4 \strokec4 );\
        \cf5 \strokec5 int\cf4 \strokec4  \cf8 \strokec8 num1\cf4 \strokec4  \cf6 \strokec6 =\cf4 \strokec4  \cf8 \strokec8 sc\cf4 \strokec4 .\cf7 \strokec7 nextInt\cf4 \strokec4 ( );\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "Enter the 2nd number :"\cf4 \strokec4 );\
        \cf5 \strokec5 int\cf4 \strokec4  \cf8 \strokec8 num2\cf4 \strokec4  \cf6 \strokec6 =\cf4 \strokec4  \cf8 \strokec8 sc\cf4 \strokec4 .\cf7 \strokec7 nextInt\cf4 \strokec4 ( );\
    \
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "Arithmetic operations"\cf4 \strokec4 );\
    \
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "Addition : "\cf6 \strokec6 +\cf4 \strokec4  (\cf8 \strokec8 num1\cf6 \strokec6 +\cf8 \strokec8 num2\cf4 \strokec4 ));\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "Subtraction : "\cf6 \strokec6 +\cf4 \strokec4  (\cf8 \strokec8 num1\cf4 \strokec4  \cf6 \strokec6 -\cf4 \strokec4  \cf8 \strokec8 num2\cf4 \strokec4 ));\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "Multiplication : "\cf6 \strokec6 +\cf4 \strokec4  (\cf8 \strokec8 num1\cf4 \strokec4  \cf6 \strokec6 *\cf4 \strokec4  \cf8 \strokec8 num2\cf4 \strokec4 ));\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "Division : "\cf6 \strokec6 +\cf4 \strokec4  (\cf8 \strokec8 num1\cf6 \strokec6 /\cf8 \strokec8 num2\cf4 \strokec4 ));\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "Reminder : "\cf6 \strokec6 +\cf4 \strokec4  (\cf8 \strokec8 num1\cf6 \strokec6 %\cf8 \strokec8 num2\cf4 \strokec4 ));\
\
        \cf8 \strokec8 sc\cf4 \strokec4 .\cf7 \strokec7 close\cf4 \strokec4 ( );\
    \}\
\}\
\
2.\
\pard\pardeftab720\partightenfactor0
\cf2 \strokec2 public\cf4 \strokec4  \cf2 \strokec2 class\cf4 \strokec4  \cf5 \strokec5 unaryOperators\cf4 \strokec4  \{\
    \cf2 \strokec2 public\cf4 \strokec4  \cf2 \strokec2 static\cf4 \strokec4  \cf5 \strokec5 void\cf4 \strokec4  \cf7 \strokec7 main\cf4 \strokec4 (\cf5 \strokec5 String\cf4 \strokec4 [] \cf8 \strokec8 args\cf4 \strokec4 ) \{\
        \cf5 \strokec5 int\cf4 \strokec4  \cf8 \strokec8 a\cf4 \strokec4  \cf6 \strokec6 =\cf4 \strokec4  \cf12 \strokec12 10\cf4 \strokec4 ;\
        \cf5 \strokec5 int\cf4 \strokec4  \cf8 \strokec8 b\cf4 \strokec4  \cf6 \strokec6 =\cf4 \strokec4  \cf6 \strokec6 -\cf12 \strokec12 20\cf4 \strokec4 ;\
        \cf5 \strokec5 boolean\cf4 \strokec4  \cf8 \strokec8 flag\cf4 \strokec4  \cf6 \strokec6 =\cf4 \strokec4  \cf2 \strokec2 true\cf4 \strokec4 ;\
\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "Unary Operators Demonstration"\cf4 \strokec4 );\
\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "Unary plus (+a): "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf6 \strokec6 +\cf8 \strokec8 a\cf4 \strokec4 ));\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "Unary minus (-a): "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf6 \strokec6 -\cf8 \strokec8 a\cf4 \strokec4 ));\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "Unary minus on b (-b): "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf6 \strokec6 -\cf8 \strokec8 b\cf4 \strokec4 ));\
\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "Original value of a: "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf8 \strokec8 a\cf4 \strokec4 );\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "Post-increment (a++): "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf8 \strokec8 a\cf6 \strokec6 ++\cf4 \strokec4 )); \
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "After post-increment, a = "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf8 \strokec8 a\cf4 \strokec4 );\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "Pre-increment (++a): "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf6 \strokec6 ++\cf8 \strokec8 a\cf4 \strokec4 )); \
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "Post-decrement (a--): "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf8 \strokec8 a\cf6 \strokec6 --\cf4 \strokec4 )); \
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "After post-decrement, a = "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf8 \strokec8 a\cf4 \strokec4 );\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "Pre-decrement (--a): "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf6 \strokec6 --\cf8 \strokec8 a\cf4 \strokec4 )); \
\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "Logical NOT (!flag): "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf6 \strokec6 !\cf8 \strokec8 flag\cf4 \strokec4 ));\
    \}\
\}\
\pard\pardeftab720\partightenfactor0
\cf4 \
3.\
\pard\pardeftab720\partightenfactor0
\cf2 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 java\cf6 \strokec6 .\cf5 \strokec5 util\cf6 \strokec6 .\cf5 \strokec5 Scanner\cf4 \strokec4 ;\
\
\cf2 \strokec2 public\cf4 \strokec4  \cf2 \strokec2 class\cf4 \strokec4  \cf5 \strokec5 relationalOperators\cf4 \strokec4  \{\
    \cf2 \strokec2 public\cf4 \strokec4  \cf2 \strokec2 static\cf4 \strokec4  \cf5 \strokec5 void\cf4 \strokec4  \cf7 \strokec7 main\cf4 \strokec4 (\cf5 \strokec5 String\cf4 \strokec4 [] \cf8 \strokec8 args\cf4 \strokec4 ) \{\
        \cf5 \strokec5 Scanner\cf4 \strokec4  \cf8 \strokec8 sc\cf4 \strokec4  \cf6 \strokec6 =\cf4 \strokec4  \cf9 \strokec9 new\cf4 \strokec4  \cf7 \strokec7 Scanner\cf4 \strokec4 (\cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 in\cf4 \strokec4 );\
\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 print\cf4 \strokec4 (\cf11 \strokec11 "Enter the first number: "\cf4 \strokec4 );\
        \cf5 \strokec5 int\cf4 \strokec4  \cf8 \strokec8 num1\cf4 \strokec4  \cf6 \strokec6 =\cf4 \strokec4  \cf8 \strokec8 sc\cf4 \strokec4 .\cf7 \strokec7 nextInt\cf4 \strokec4 ();\
\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 print\cf4 \strokec4 (\cf11 \strokec11 "Enter the second number: "\cf4 \strokec4 );\
        \cf5 \strokec5 int\cf4 \strokec4  \cf8 \strokec8 num2\cf4 \strokec4  \cf6 \strokec6 =\cf4 \strokec4  \cf8 \strokec8 sc\cf4 \strokec4 .\cf7 \strokec7 nextInt\cf4 \strokec4 ();\
\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "Relational Operations "\cf4 \strokec4 );\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf8 \strokec8 num1\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf11 \strokec11 " == "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf8 \strokec8 num2\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf11 \strokec11 " : "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf8 \strokec8 num1\cf4 \strokec4  \cf6 \strokec6 ==\cf4 \strokec4  \cf8 \strokec8 num2\cf4 \strokec4 ));\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf8 \strokec8 num1\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf11 \strokec11 " != "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf8 \strokec8 num2\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf11 \strokec11 " : "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf8 \strokec8 num1\cf4 \strokec4  \cf6 \strokec6 !=\cf4 \strokec4  \cf8 \strokec8 num2\cf4 \strokec4 ));\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf8 \strokec8 num1\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf11 \strokec11 " > "\cf4 \strokec4   \cf6 \strokec6 +\cf4 \strokec4  \cf8 \strokec8 num2\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf11 \strokec11 " : "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf8 \strokec8 num1\cf4 \strokec4  \cf6 \strokec6 >\cf4 \strokec4  \cf8 \strokec8 num2\cf4 \strokec4 ));\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf8 \strokec8 num1\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf11 \strokec11 " < "\cf4 \strokec4   \cf6 \strokec6 +\cf4 \strokec4  \cf8 \strokec8 num2\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf11 \strokec11 " : "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf8 \strokec8 num1\cf4 \strokec4  \cf6 \strokec6 <\cf4 \strokec4  \cf8 \strokec8 num2\cf4 \strokec4 ));\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf8 \strokec8 num1\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf11 \strokec11 " >= "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf8 \strokec8 num2\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf11 \strokec11 " : "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf8 \strokec8 num1\cf4 \strokec4  \cf6 \strokec6 >=\cf4 \strokec4  \cf8 \strokec8 num2\cf4 \strokec4 ));\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf8 \strokec8 num1\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf11 \strokec11 " <= "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf8 \strokec8 num2\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf11 \strokec11 " : "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf8 \strokec8 num1\cf4 \strokec4  \cf6 \strokec6 <=\cf4 \strokec4  \cf8 \strokec8 num2\cf4 \strokec4 ));\
\
        \cf8 \strokec8 sc\cf4 \strokec4 .\cf7 \strokec7 close\cf4 \strokec4 ();\
    \}\
\}\
\
4.\
\cf2 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 java\cf6 \strokec6 .\cf5 \strokec5 util\cf6 \strokec6 .\cf5 \strokec5 Scanner\cf4 \strokec4 ;\
\
\cf2 \strokec2 public\cf4 \strokec4  \cf2 \strokec2 class\cf4 \strokec4  \cf5 \strokec5 logicalOperators\cf4 \strokec4  \{\
    \cf2 \strokec2 public\cf4 \strokec4  \cf2 \strokec2 static\cf4 \strokec4  \cf5 \strokec5 void\cf4 \strokec4  \cf7 \strokec7 main\cf4 \strokec4 (\cf5 \strokec5 String\cf4 \strokec4 [] \cf8 \strokec8 args\cf4 \strokec4 ) \{\
        \cf5 \strokec5 Scanner\cf4 \strokec4  \cf8 \strokec8 sc\cf4 \strokec4  \cf6 \strokec6 =\cf4 \strokec4  \cf9 \strokec9 new\cf4 \strokec4  \cf7 \strokec7 Scanner\cf4 \strokec4 (\cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 in\cf4 \strokec4 );\
\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 print\cf4 \strokec4 (\cf11 \strokec11 "Enter first number: "\cf4 \strokec4 );\
        \cf5 \strokec5 int\cf4 \strokec4  \cf8 \strokec8 a\cf4 \strokec4  \cf6 \strokec6 =\cf4 \strokec4  \cf8 \strokec8 sc\cf4 \strokec4 .\cf7 \strokec7 nextInt\cf4 \strokec4 ();\
\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 print\cf4 \strokec4 (\cf11 \strokec11 "Enter second number: "\cf4 \strokec4 );\
        \cf5 \strokec5 int\cf4 \strokec4  \cf8 \strokec8 b\cf4 \strokec4  \cf6 \strokec6 =\cf4 \strokec4  \cf8 \strokec8 sc\cf4 \strokec4 .\cf7 \strokec7 nextInt\cf4 \strokec4 ();\
\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "Logical Operators "\cf4 \strokec4 );\
\
        \cf5 \strokec5 boolean\cf4 \strokec4  \cf8 \strokec8 cond1\cf4 \strokec4  \cf6 \strokec6 =\cf4 \strokec4  (\cf8 \strokec8 a\cf4 \strokec4  \cf6 \strokec6 >\cf4 \strokec4  \cf12 \strokec12 0\cf4 \strokec4 );     \
        \cf5 \strokec5 boolean\cf4 \strokec4  \cf8 \strokec8 cond2\cf4 \strokec4  \cf6 \strokec6 =\cf4 \strokec4  (\cf8 \strokec8 b\cf4 \strokec4  \cf6 \strokec6 >\cf4 \strokec4  \cf12 \strokec12 0\cf4 \strokec4 );     \
\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "Condition 1 (a > 0): "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf8 \strokec8 cond1\cf4 \strokec4 );\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "Condition 2 (b > 0): "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf8 \strokec8 cond2\cf4 \strokec4 );\
\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "cond1 && cond2 : "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf8 \strokec8 cond1\cf4 \strokec4  \cf6 \strokec6 &&\cf4 \strokec4  \cf8 \strokec8 cond2\cf4 \strokec4 ));\
\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "cond1 || cond2 : "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf8 \strokec8 cond1\cf4 \strokec4  \cf6 \strokec6 ||\cf4 \strokec4  \cf8 \strokec8 cond2\cf4 \strokec4 ));\
\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "!cond1 : "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf6 \strokec6 !\cf8 \strokec8 cond1\cf4 \strokec4 ));\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "!cond2 : "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf6 \strokec6 !\cf8 \strokec8 cond2\cf4 \strokec4 ));\
\
        \cf8 \strokec8 sc\cf4 \strokec4 .\cf7 \strokec7 close\cf4 \strokec4 ();\
    \}\
\}\cb1 \
\
5.\
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 java\cf6 \strokec6 .\cf5 \strokec5 util\cf6 \strokec6 .\cf5 \strokec5 Scanner\cf4 \strokec4 ;\
\
\cf2 \strokec2 public\cf4 \strokec4  \cf2 \strokec2 class\cf4 \strokec4  \cf5 \strokec5 bitwiseOperators\cf4 \strokec4  \{\
    \cf2 \strokec2 public\cf4 \strokec4  \cf2 \strokec2 static\cf4 \strokec4  \cf5 \strokec5 void\cf4 \strokec4  \cf7 \strokec7 main\cf4 \strokec4 (\cf5 \strokec5 String\cf4 \strokec4 [] \cf8 \strokec8 args\cf4 \strokec4 ) \{\
        \cf5 \strokec5 Scanner\cf4 \strokec4  \cf8 \strokec8 sc\cf4 \strokec4  \cf6 \strokec6 =\cf4 \strokec4  \cf9 \strokec9 new\cf4 \strokec4  \cf7 \strokec7 Scanner\cf4 \strokec4 (\cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 in\cf4 \strokec4 );\
\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 print\cf4 \strokec4 (\cf11 \strokec11 "Enter first number: "\cf4 \strokec4 );\
        \cf5 \strokec5 int\cf4 \strokec4  \cf8 \strokec8 a\cf4 \strokec4  \cf6 \strokec6 =\cf4 \strokec4  \cf8 \strokec8 sc\cf4 \strokec4 .\cf7 \strokec7 nextInt\cf4 \strokec4 ();\
\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 print\cf4 \strokec4 (\cf11 \strokec11 "Enter second number: "\cf4 \strokec4 );\
        \cf5 \strokec5 int\cf4 \strokec4  \cf8 \strokec8 b\cf4 \strokec4  \cf6 \strokec6 =\cf4 \strokec4  \cf8 \strokec8 sc\cf4 \strokec4 .\cf7 \strokec7 nextInt\cf4 \strokec4 ();\
\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "Bitwise Operations "\cf4 \strokec4 );\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf8 \strokec8 a\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf11 \strokec11 " & "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf8 \strokec8 b\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf11 \strokec11 " : "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf8 \strokec8 a\cf4 \strokec4  \cf6 \strokec6 &\cf4 \strokec4  \cf8 \strokec8 b\cf4 \strokec4 ));   \
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf8 \strokec8 a\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf11 \strokec11 " | "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf8 \strokec8 b\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf11 \strokec11 " : "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf8 \strokec8 a\cf4 \strokec4  \cf6 \strokec6 |\cf4 \strokec4  \cf8 \strokec8 b\cf4 \strokec4 ));  \
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf8 \strokec8 a\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf11 \strokec11 " ^ "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf8 \strokec8 b\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf11 \strokec11 " : "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf8 \strokec8 a\cf4 \strokec4  \cf6 \strokec6 ^\cf4 \strokec4  \cf8 \strokec8 b\cf4 \strokec4 ));   \
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "~"\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf8 \strokec8 a\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf11 \strokec11 " : "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf6 \strokec6 ~\cf8 \strokec8 a\cf4 \strokec4 ));            \
\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf11 \strokec11 "Shift Operations "\cf4 \strokec4 );\
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf8 \strokec8 a\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf11 \strokec11 " << 1 : "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf8 \strokec8 a\cf4 \strokec4  \cf6 \strokec6 <<\cf4 \strokec4  \cf12 \strokec12 1\cf4 \strokec4 ));         \
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf8 \strokec8 a\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf11 \strokec11 " >> 1 : "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf8 \strokec8 a\cf4 \strokec4  \cf6 \strokec6 >>\cf4 \strokec4  \cf12 \strokec12 1\cf4 \strokec4 ));         \
        \cf5 \strokec5 System\cf4 \strokec4 .\cf10 \strokec10 out\cf4 \strokec4 .\cf7 \strokec7 println\cf4 \strokec4 (\cf8 \strokec8 a\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  \cf11 \strokec11 " >>> 1 : "\cf4 \strokec4  \cf6 \strokec6 +\cf4 \strokec4  (\cf8 \strokec8 a\cf4 \strokec4  \cf6 \strokec6 >>>\cf4 \strokec4  \cf12 \strokec12 1\cf4 \strokec4 ));       \
\
        \cf8 \strokec8 sc\cf4 \strokec4 .\cf7 \strokec7 close\cf4 \strokec4 ();\
    \}\
\}\
\cb1 \
\pard\pardeftab720\partightenfactor0
\cf4 \cb3 \
\
}