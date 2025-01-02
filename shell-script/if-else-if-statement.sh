


echo "Please enter 4 values: \c"
read -r a
read -r b
read -r c
read -r d

if [ $a -gt $b -a $a -gt $c -a $a -gt $d ]; then
echo "$a a is big"
elif [ $b -gt $c -a $b -gt $d ]; then
echo "$b b is big"
elif [ $c -gt $d ]; then
echo "$c c is big"
else
echo "$d d is big"
fi
