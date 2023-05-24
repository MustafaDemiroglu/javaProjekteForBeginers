package p_03_projekte;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.awt.Color;

public class P_03_TaschenRechner_v2 extends Applet implements ActionListener

{
  double e1,e2,ergebnis;                                                          //Variablen deklarieren
  String u,r,p;

  Panel Oben             = new Panel ();                                         //Panels erzeugen
  Panel Rechts           = new Panel ();
  Panel MitteR           = new Panel ();
  Panel Mitte            = new Panel ();
  Panel MitteL           = new Panel ();
  Panel Links            = new Panel ();
  
  TextField Bildschirm   = new TextField ("0",25);                               //Bildschirm erzeugen
  Button B0              = new Button ("0");                                     //Knöpfe erzeugen
  Button B1              = new Button ("1");
  Button B2              = new Button ("2");
  Button B3              = new Button ("3");
  Button B4              = new Button ("4");
  Button B5              = new Button ("5");
  Button B6              = new Button ("6");
  Button B7              = new Button ("7");
  Button B8              = new Button ("8");
  Button B9              = new Button ("9");
  Button BKomma          = new Button (".");
  Button BVorzeichen     = new Button ("+/-");
  Button BDividieren     = new Button ("/");
  Button BMultiplizieren = new Button ("*");
  Button BSubtrahieren   = new Button ("-");
  Button BAddieren       = new Button ("+");
  Button BErgebnis       = new Button ("=");
  Button BPI             = new Button ("PI");
  Button BWurzel         = new Button ("Wurzel");
  Button XWurzel         = new Button ("x.Wurzel");
  Button BQuadrieren     = new Button ("x^2");
  Button BPotenzieren    = new Button ("x^y");
  Button BLöschen        = new Button ("CE");
  
 public void init ()
 {
  B0.addActionListener              (this);                                      //ActionListener an die Knöpfe anhängen
  B1.addActionListener              (this);
  B2.addActionListener              (this);
  B3.addActionListener              (this);
  B4.addActionListener              (this);
  B5.addActionListener              (this);
  B6.addActionListener              (this);
  B7.addActionListener              (this);
  B8.addActionListener              (this);
  B9.addActionListener              (this);
  BKomma.addActionListener          (this);
  BVorzeichen.addActionListener     (this);
  BDividieren.addActionListener     (this);
  BMultiplizieren.addActionListener (this);
  BSubtrahieren.addActionListener   (this);
  BAddieren.addActionListener       (this);
  BErgebnis.addActionListener       (this);
  BPI.addActionListener             (this);
  BWurzel.addActionListener         (this);
  XWurzel.addActionListener         (this);
  BQuadrieren.addActionListener     (this);
  BPotenzieren.addActionListener    (this);
  BLöschen.addActionListener        (this);

  Oben ();
  Links ();
  MitteL ();
  Mitte ();
  MitteR ();
  Rechts ();

  setLayout (null);                                                              //Nulllayout

  add (Oben);                                                                    //Panels Hinzufügen
  add (Links);
  add (MitteL);
  add (Mitte);
  add (MitteR);
  add (Rechts);
  
  Oben.setBounds (10,5,170,30);                                                  //Größe der Panels
  Links.setBounds (10,25,60,170);
  MitteL.setBounds (35,25,85,170);
  Mitte.setBounds (60,25,110,170);
  MitteR.setBounds (85,25,135,170);
  Rechts.setBounds (110,0,160,195);
 }
 
 public void Oben()                                                             //Einteilung des oberen Panels
 {
  Oben.setLayout (null);
  Oben.add (Bildschirm);
  Bildschirm.setBounds (10,10,150,20);
 }
 
 public void Links()                                                             //Einteilung des linken Panels
 {
  Links.setLayout (null);
  Links.add (B7);
  Links.add (B4);
  Links.add (B1);
  Links.add (B0);
  B7.setBounds (10,50,50,30);
  B4.setBounds (10,80,50,30);
  B1.setBounds (10,110,50,30);
  B0.setBounds (10,140,50,30);
 }
 
 public void MitteL()                                                            //Einteilung des mittleren-linken Panels
 {
  MitteL.setLayout (null);
  MitteL.add (B8);
  MitteL.add (B5);
  MitteL.add (B2);
  MitteL.add (BKomma);
  B8.setBounds (35,50,50,30);
  B5.setBounds (35,80,50,30);
  B2.setBounds (35,110,50,30);
  BKomma.setBounds (35,140,50,30);
 }
 
 public void Mitte()                                                             //Einteilung des mittleren Panels
 {
  Mitte.setLayout (null);
  Mitte.add (B9);
  Mitte.add (B6);
  Mitte.add (B3);
  Mitte.add (BVorzeichen);
  B9.setBounds (60,50,50,30);
  B6.setBounds (60,80,50,30);
  B3.setBounds (60,110,50,30);
  BVorzeichen.setBounds (60,140,50,30);
 }
 
 public void MitteR()                                                            //Einteilung des mittleren-rechten Panels
 {
  MitteR.setLayout (null);
  MitteR.add (BPI);
  MitteR.add (BQuadrieren);
  MitteR.add (BPotenzieren);
  MitteR.add (BWurzel);
  MitteR.add (XWurzel);
  BPI.setBounds (85,20,50,30);
  BQuadrieren.setBounds (85,50,50,30);
  BPotenzieren.setBounds (85,80,50,30);
  BWurzel.setBounds (85,110,50,30);
  XWurzel.setBounds (85,140,50,30);
 }
 
 public void Rechts()                                                            //Einteilung des rechten Panels
 {
  Rechts.setLayout (null);
  Rechts.add (BLöschen);
  Rechts.add (BDividieren);
  Rechts.add (BMultiplizieren);
  Rechts.add (BSubtrahieren);
  Rechts.add (BAddieren);
  Rechts.add (BErgebnis);
  BLöschen.setBounds (110,15,50,30);
  BDividieren.setBounds (110,45,50,30);
  BMultiplizieren.setBounds (110,75,50,30);
  BSubtrahieren.setBounds (110,105,50,30);
  BAddieren.setBounds (110,135,50,30);
  BErgebnis.setBounds (110,165,50,30);
 }
 
 public void actionPerformed (ActionEvent e)                                     //Actionen der Knöpfe
 {
  String s = e.getActionCommand ();

  if (s.equals ("0"))                                                            //Knopf für die Zahl 0
  {
   p = Bildschirm.getText ();
   Bildschirm.setText (p + "0");
  }

  if (s.equals ("1"))                                                            //Knopf für die Zahl 1
  {
   p = Bildschirm.getText ();
   Bildschirm.setText (p + "1");
  }

  if (s.equals ("2"))                                                            //Knopf für die Zahl 2
  {
   p = Bildschirm.getText ();
   Bildschirm.setText (p + "2");
  }
  
  if (s.equals ("3"))                                                            //Knopf für die Zahl 3
  {
   p = Bildschirm.getText ();
   Bildschirm.setText (p + "3");
  }
  
  if (s.equals ("4"))                                                            //Knopf für die Zahl 4
  {
   p = Bildschirm.getText ();
   Bildschirm.setText (p + "4");
  }
  
  if (s.equals ("5"))                                                            //Knopf für die Zahl 5
  {
   p = Bildschirm.getText ();
   Bildschirm.setText (p + "5");
  }
  
  if (s.equals ("6"))                                                            //Knopf für die Zahl 6
  {
   p = Bildschirm.getText ();
   Bildschirm.setText (p + "6");
  }
  
  if (s.equals ("7"))                                                            //Knopf für die Zahl 7
  {
   p = Bildschirm.getText ();
   Bildschirm.setText (p + "7");
  }
  
  if (s.equals ("8"))                                                            //Knopf für die Zahl 8
  {
   p = Bildschirm.getText ();
   Bildschirm.setText (p + "8");
  }
  
  if (s.equals ("9"))                                                            //Knopf für die Zahl 9
  {
   p = Bildschirm.getText ();
   Bildschirm.setText (p + "9");
  }
  
  if (s.equals ("."))                                                            //Knopf für das Komma
  {
   p = Bildschirm.getText ();
   Bildschirm.setText (p + ".");
  }
  
  if (s.equals ("+/-"))                                                          //Knopf für Vorzeichen
  {
   p = Bildschirm.getText ();
   Bildschirm.setText ("-" + p);
  }
  
  if (s.equals ("/"))                                                            //Knopf für Division
  {
   
  }
  
  if (s.equals ("*"))                                                            //Knopf für Multiplikation
  {

  }
  
  if (s.equals ("-"))                                                            //Knopf für die Substraktion
  {

  }
  
  if (s.equals ("+"))                                                            //Knopf für die Addition
  {

  }
  
  
  if (s.equals ("PI"))                                                           //Knopf für die Zahl PI
  {
   Bildschirm.setText("" + Math.PI);
  }
  
  if (s.equals ("Wurzel"))                                                      //Knopf für das Wurzeln
  {

  }
  
  if (s.equals ("x.Wurzel"))                                                     //Knopf für die x-te Wurzel
  {

  }
  
  if (s.equals ("x^2"))                                                          //Knopf für das Quadrieren
  {

  }
  
  if (s.equals ("x^y"))                                                          //Knopf für das Potenzieren
  {

  }
  
  if (s.equals ("CE"))                                                           //Knopf für das Resetten
  {
   Bildschirm.setText ("0");
  }
 }
}