A=10
Ba=23
BA=45
HOSTNAME=$(hostname)
DATE=`date`
1VALUE=333
FALSE@VAR=FALSE
Hyphen-a=WrongValue

echo "Variable A Value: $A"
echo "Variable B Value: $Ba"
echo "Variable BA Value: $BA"
echo "Variable HOST value: $HOSTNAME"
echo "Variable DATE value: $DATE"
echo "Wrong Variable 1value $1value"
echo 'False @ Variable' $False@Var
echo "Hyphen-a Variable Value: $Hyphen-a"

