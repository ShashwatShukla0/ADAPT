var circle = {
    print: print("This is circle")
};
var employee = {
    print: print("This is employee")
};
function printAll(arr) {
    arr.forEach(function (x) { return x.print; });
}
var a = new Array();
a.push(circle);
a.push(employee);
printAll(a);