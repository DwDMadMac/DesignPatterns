package net.pl3x.structural.patterns.bridge.problem;

/*
 * Let's say we are going to have a couple controls like
 * -> Basic Remote control (turnOn, turnOff)
 * -> Advanced Remote Control (setChannel)
 * -> Movie Remote Control (play, pause, rewind)
 *
 * Making our class like the below is a problem because at the
 * time of implementing this class we do not know how to turn
 * on or off the TV. That is determined by the type of TV you
 * are trying to talk too. For example, if you want to talk to a
 * sony TV we should use some software library provided by sony
 * this library knows how to talk to the hardware inside sony
 * TV. So we want to make these methods and class abstract and
 * implement them later on.
 *
public class RemoteControl {
    public void tunOn() {}

    public void turnOff(){}
}
*
* Hierarchy setup for the classes
*
* RemoteControl
* -> SonyRemoteControl
* -> AdvancedRemoteControl
* ->-> SonyAdvancedRemoteControl
*
* So let's say tomorrow we want to support a new TV brand
* like Samsung. To do this we will need to create two (2) new
* additional classes in the hierarchy.
*
* RemoteControl
* -> SonyRemoteControl
* -> SamsungRemoteControl
* -> AdvancedRemoteControl
* ->-> SonyAdvancedRemoteControl
* ->-> AdvancedSamsungRemoteControl
*
* So let's say we want to add anotherTV brand. We would
* need to add two (2) more class and so on. We would always
* need to keep adding additional classes to support more TV brands.
*
* So now let's think about how many controls we currently have: two (2)
* which are tunOn() & turnOff(). Let's say we want to add another
* remote control, we will need to add another class for each tv and
* each control. As time goes our hierarchy will continue to grow
* larger and larger and complex. This is where we can use the bridge pattern.
*
* With the Bridge Pattern, we can build a simple yet flexible hierarchy.
*
*/
public abstract class RemoteControl {
    public abstract void tunOn();

    public abstract void turnOff();
}