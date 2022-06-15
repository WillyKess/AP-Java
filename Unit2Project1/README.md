**DIRECTIONS:** Fill in each blank with the proper java code then use Python to code the two classes and run them.

Class code:

```java
class Beast{
    //data not shown

    public Beast(String n, int a){
        //code not shown
    }

    //other methods now shown
}


class Beasts
{
    private Beast[] things;

    public Beasts(int size)
    {
        _______________________________________________
    }

    public void set(int spot, Beast b)
    {
        _______________________________________________
    }

    public String toString()
    {
        return Arrays.toString(things);
    }
}
```

Client code:

```java
Beasts group  =  _______________________________________________

for(int r=1; r<=runCount; r++) {
    _______________________________________________    //code to add a Beast to the group
}

System.out.println(group);
```

**Data:**
| Beast | Age |
| ----- | --- |
| dog | 1 |
| cat | 7 |
| spot | 9 |
| fido | 3 |
| garfield | 22 |
| odie | 8 |
| porky | 32 |

**Output:**  
`[dog - 1, cat - 7, spot - 9, fido - 3, garfield - 22, odie - 8, porky - 32]`
