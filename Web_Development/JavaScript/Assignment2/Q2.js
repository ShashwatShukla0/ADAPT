function square(x)
  {
    return x*x;
  }
function double(x)
  {
    return x*2;
  }
function compose(square,double,x)
{
  return square(double(x));
}
var f1= compose(square,double,5);
var f2= compose(double,square,5);

console.log(f1);
console.log(f2);

