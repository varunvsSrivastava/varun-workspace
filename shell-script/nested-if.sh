

echo "Please enter maths marks:\c"
read -r m
echo "Please enter physics marks:\c"
read -r p
echo "Please enter chemistry marks:\c"
read -r c

if [ $m -gt 35 -a $p -gt 35 -a $c -gt 35 ]; then
total=`expr $m + $p + $c`
avg=`expr $total / 3`
echo "Total Marks = $total"
echo "Average Marks = $avg"
	if [ $avg -gt 75 ]; then
	echo "Congrats u got distinction"
	elif [ $avg -gt 60 -a $avg -lt 75 ]; then
	echo "Congrates you got First Class"
	elif [ $avg -gt 50 -a $avg -lt 60 ]; then
	echo "You got second class"
	elif [ $avg -gt 35 -a $avg -lt 50 ]; then
	echo "You got third class"
	fi
else
echo "Sorry you failed"
fi
