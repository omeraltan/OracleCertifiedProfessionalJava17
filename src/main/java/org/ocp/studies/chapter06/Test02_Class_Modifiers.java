package org.ocp.studies.chapter06;

public class Test02_Class_Modifiers {

    //  Modifiers           Description
    //  ---------           -----------

    //  final               The class may not be extended.
    //  abstract            The class is abstract, may contain abstract methods, and requires a concrete subclass to instantiate.
    //  sealed              The class may only be extended by a specific list of classes.
    //  non-sealed          A subclass of a sealed class permits potentially unnamed subclasses.
    //  static              Used for static nested classes defined within a class.

}

class Mammal{ }

final class Rhinoceros extends Mammal { }

// class Clara extends Rhinoceros { } // DOES NOT COMPILE


