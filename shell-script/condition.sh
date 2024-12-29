#!/bin/bash
num1=100
num2=50
if(( "$num1" > "$num2" ))
then
	echo "$num1 is bigger than $num2"
else
	echo "$num2 is bigger than $num1"
fi
