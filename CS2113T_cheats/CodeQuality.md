# Code quality tips

1. Avoid long methods
2. Avoid deep nesting eg. For loops or conditionals
3. Avoid single line expressions eg.
```c
int test = wow?10:20;
```
4. Avoid magic numbers
5. Code variables should be obvious
6. Remove unecessary comments
7. Abstract out fragments to other methods (method extraction)
8. Avoid empty catch blocks
9. Practice defensive coding for variables obtained from the function parameter (use assert when needed)
