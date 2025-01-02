
#To write the multiple conditions, validate multiple conditions and execute the statement.

#AND operator
echo "Enter your maths subject marks: \c"
read -r m
echo "Enter your physics subject marks: \c"
read -r p
echo "Enter your chemistry subject marks: \c"
read -r c

if test $m -ge 35 -a $p -ge 35 -a $c -ge 35
then 
echo "You're passed"
else
echo "Sorry you're not passed"
fi


#OR operator method 1
echo "Enter first numeric value: \c"
read -r t
echo "Enter second numeric value: \c"
read -r b

if test $t -le 20 -o $b -ge 30
then
echo "Statement is true"
else
echo "False statement, try again"
fi

#OR operator method 2
echo "Enter your number: \c"
read -r g
if  [ $g -le 20 ] || [ $g -ge 40 ] 
then
echo "true"
else
echo "false"
fi

#NOT operator
echo "Enter your number: \c"
read -r h
if ! [ $h -le 20 ]
then
echo "true"
else
echo "false"
fi




