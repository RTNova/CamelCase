---
title: 'Kata2. String a CamelCase'
disqus: hackmd
---

Kata2. String a CamelCase
===
>***Owner del proyecto: RTNova***

User story
---

```gherkin=

  # Clase con metodos que trabajan con strings
  Escenario: El usuario introduce un String.
  
  El programa se encarga de decodificar la string
  y formatearla a CamelCase.
    
```

## Bloques de código

### Main.java

```gherkin=
public class Main {

    public static void main(String args[]) {

        Solution s = new Solution();
        System.out.println(s.toCamelCase("hola"));

    }
} 
```

### Solution.java

```gherkin=
import java.util.Arrays;

class Solution{

    public Solution() {}

    public static String toCamelCase(String str){

        if (str == null || str.isEmpty()) {
            return str;
        }

        String[] words = str.split("[-_]");
        StringBuilder camelCaseString = new StringBuilder(words[0]);

        for (int i = 1; i < words.length; i++) {
            camelCaseString.append(words[i].substring(0, 1).toUpperCase())
                    .append(words[i].substring(1));
        }

        return camelCaseString.toString();
    }
}
```

### SolutionTest.java

```gherkin=
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {

    @Test
    public void testSomeUnderscoreLowerStart() {

        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", Solution.toCamelCase(input));

    }
    @Test
    public void testSomeDashLowerStart() {

        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", Solution.toCamelCase(input));

    }
}
```

## Ejemplos de uso

```gherkin=
@param      "the-stealth-warrior"
@returns    "theStealthWarrior"
```

```gherkin=
@param      "The_Stealth_Warrior"
@returns    "TheStealthWarrior"
```

```gherkin=
@param      "The_Stealth-Warrior"
@returns    "TheStealthWarrior"
```