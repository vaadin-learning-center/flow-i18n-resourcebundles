# flow-i18n-resourcebundles
How to start with a custom resource bundles in Flow.

In this tutorial we will learn how to implement a custom ResourceBundle
that is used for the translation functionality inside Flow.
Focus will be the question, how to deal with different languages (I18N).

> All tutorials are available under [https://vaadin.com/tutorials](https://vaadin.com/tutorials)

If a more dynamic or customized ResourceBundle is needed, you have to implement it yourself.
This code demo will show how to implement a easy custom ResourceBundle that will be used in a VaadinApp
together with the I18NProvider.

For more detailed information, read the tutorial at 
[https://vaadin.com/tutorials/i18n/resourcebundles](https://vaadin.com/tutorials/i18n/resourcebundles) please.


This repo contains two implementations of a ResourceBundle.
The first one is based on the *ListResourceBundle* and the source 
is in the test source folder.
*junit.com.vaadin.tutorial.flow.i18n.resourcebundles.v01*

The second implementation is based on the abstract class ResouceBundle itself.
This demo is in the main source folder. (*com.vaadin.tutorial.flow.i18n.resourcebundles.VaadinResourceBundle*)


