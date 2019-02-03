# Scientific-Calculator
Scientific Calculator with kotlin. (Not using javaluator lib.)

Not used javaluator lib. I developed an algorithm.(a little complicated)
You can find Turkish descriptions in project.

Algorithm Explanation : 
	
There is two classes created for mathematical operations: OpNode and Operations. I made them parcelable.
Opnode has sayi1 and islem variables. sayi1(54 for ex.) is holds a number, islem("+" for ex.) is holds an operation text on right of sayi1.
Operations class has an variable as arraylist of OpNode.[(4,"+"),(9,"-")]

In MainActivity defined 2 variables: parantezler and parantezSayac. parantezler(parenthesis) is an arrayList of Operations, parantezSayac is an pointer for parantezler arraylist. When you clicked left bracket: parantezSayac +=1, when you clicked right bracket code calls parantezCoz function and this function solves the parantezler[parantezSayac] arraylist and shows it on OperationText textview.

There is too many controls(if) for special situations and bugs.

And I added an Unit Converter. You can open it with menu.

