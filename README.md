# Command--Design-Pattern

### Fuente 1:

- Command: Declares an interface for executing an operation.

- ConcreteCommand: Defines a binding between a Receiver object and an action.
Implements Execute by invoking the corresponding operation(s) on Receiver.

- Client: Creates a ConcreteCommand object and sets its receiver.

- Invoker: Asks the command to carry out the request.

- Receiver: Knows how to perform the operations associated with carrying out a request. Any class may serve as a Receiver

### Fuente 2:
- Receiver: Receives actions vida Commands

- Command: Binds an action to a Reciever

- Invoker: Hanlde a collections of Commands and determines when  Commands are executed.

- Client: Manage interaction between Reciever/Command and Command/Invoker
