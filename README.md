# Command--Design-Pattern

Cada Command representa un request que encapsula datos.

### Fuente 1:

A Command pattern is an object behavioral pattern that allows us to achieve complete decoupling between the sender and the receiver. (A sender is an object that invokes an operation, and a receiver is an object that receives the request to execute a certain operation. With decoupling, the sender has no knowledge of the Receiver's interface.) The term request here refers to the command that is to be executed. The Command pattern also allows us to vary when and how a request is fulfilled. Therefore, a Command pattern provides us flexibility as well as extensibility.

### Fuente 2:

Command is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This transformation lets you parameterize methods with different requests, delay or queue a request’s execution, and support undoable operations.

### Fuente 3:

- **Command**: Declares an interface for executing an operation.

- **ConcreteCommand**: Defines a binding between a Receiver object and an action.
Implements Execute by invoking the corresponding operation(s) on Receiver.

- **Client**: Creates a ConcreteCommand object and sets its receiver.

- **Invoker**: Asks the command to carry out the request.

- **Receiver**: Knows how to perform the operations associated with carrying out a request. Any class may serve as a Receiver

### Fuente 4:
- **Receiver**: Receives actions vida Commands

- **Command**: Binds an action to a Reciever

- **Invoker**: Hanlde a collections of Commands and determines when  Commands are executed.

- **Client**: Manage interaction between Reciever/Command and Command/Invoker

### Fuente 5:
**Real world example**

A generic example would be you ordering food at a restaurant. You (i.e. Client) ask the waiter (i.e. Invoker) to bring some food (i.e. Command) and waiter simply forwards the request to Chef (i.e. Receiver) who has the knowledge of what and how to cook. Another example would be you (i.e. Client) switching on (i.e. Command) the television (i.e. Receiver) using a remote control (Invoker).

**In plain words**

Allows you to encapsulate actions in objects. The key idea behind this pattern is to provide the means to decouple client from receiver.
