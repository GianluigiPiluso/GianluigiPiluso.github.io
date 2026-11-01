function WinOpen(Indirizzo) {
    NewWindow=window.open();
    NewWindow.document.writeln("<html>");
    NewWindow.document.writeln("<head><title>Mostra Immagine</title></head>");
    NewWindow.document.writeln("<body bgcolor=black text=white>");
    NewWindow.document.writeln("<center><img src=");
    NewWindow.document.writeln(Indirizzo);
    NewWindow.document.writeln("></center>");
    NewWindow.document.writeln("</body>");
    NewWindow.document.writeln("</html>");
  }