echo -e "Enter value: \c"
read -r a
echo -e "Enter value: \c"
read -r b

echo "Addition values `expr $a + $b`"
echo "Subtraction  values `expr $a - $b`"
echo "Multiplication values `expr $a \* $b`"
echo "Divided by values `expr $a / $b`"
echo "Remainder values `expr $a % $b`"

echo "Completed Successfully"


