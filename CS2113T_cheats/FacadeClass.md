# Facade class

Components need to access functionality deep inside other components.

- Goal: Include a Façade class that sits between the component internals and users of the component such that all access to the component happens through the Facade class.


Something like a handler which handles request and processes it in the backend

eg. ModelManager in AB4

Cons: 
- More complexities within the facade class