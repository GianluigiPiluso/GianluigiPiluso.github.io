function WinNewsOpen() {
    NewWindow=window.open("","",'toolbar=yes,location=yes,directories=yes,menubar=yes,scrollbars=yes,resizable=1 left=0, top=0, width=500,height=200');
    NewWindow.document.writeln("<html>");
    NewWindow.document.writeln("<head><title>Novità del sito</title></head>");
    NewWindow.document.writeln("<body bgcolor='#000000' link='#ffcc00' vlink='#ff0000' text='#000000'>");
    NewWindow.document.writeln("<font face=Arial color=#ffcc00 size=2>");
    NewWindow.document.writeln("<p>Queste le novità del sito... che troverete permanentemente nella pagina Sommario.htm<br>");
    NewWindow.document.writeln("<p>tra 10 secondi circa la finestra scomparirà automaticamente permettendovi la normale  e classica navigazione.<br>");
    NewWindow.document.writeln("<p>Se premete il tasto F11 forse la navigazione sarà più bella ed interessante.<br><br>");
    NewWindow.document.writeln("<center>");
    NewWindow.document.writeln("<img src='RainbowBar.gif'><br><br>");
//    NewWindow.document.writeln("<a href=ProgrDidattici.htm onClick=window.close()>Programmi Didattici Gratis<\a><br><br>");
//    NewWindow.document.writeln("<a href=Appunti.htm onClick=window.close()>Appunti<\a><br><br>");
//    NewWindow.document.writeln("<a href=ProgrIng.htm onClick=window.close()>Programmi di Ingegneria Gratis<\a><br><br>");
    NewWindow.document.writeln("<a href=JavaApplet.htm onClick=window.close()>Applet Java<\a><br><br>");
//    NewWindow.document.writeln("<a href=Sassi.htm onClick=window.close()>Sassi<\a><br><br>");
//    NewWindow.document.writeln("<a href=Foto.htm onClick=window.close()>Foto<\a><br><br>");
    NewWindow.document.writeln("<img src='RainbowBar.gif'><br><br>");
    NewWindow.document.writeln("Grazie per aver visitato il mio sito e buona navigazione...<br><br>");
    NewWindow.document.writeln("</center>");
    NewWindow.document.writeln("</font>");
    NewWindow.document.writeln("</body>");
    NewWindow.document.writeln("</html>");
    NewWindow.setTimeout("self.close()",10000);
  }