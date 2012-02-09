grammar hello;




function main 
IOVal<Integer> ::= largs::[String] ioin::IO
{

  local attribute a;
  local attribute b;


  head(largs)





  return ioval(print(toString (expt(2,3)) ++ "\n", ioin),
               0);
}


function expt
Integer ::= a::Integer b::Integer
{
return if b==0 then 1 else a * expt(a , b-1);


}










{-

function main 
IOVal<Integer> ::= largs::[String] ioin::IO
{
  return ioval(print(" World!\n",
                 print("Hello", ioin)),
               0);
}  -}
