/* Scrivi Giudizio */
var Str_Giudizio;

/* Va alla pagina indicata nella variabile alunno */
function go(alunno) {
  window.location.href = alunno;
} //Fine - go()

/* Scrive il giudizio in base alle spunte effettuate sulla pagina web */
function ScriviGiudizio() {
  Str_Giudizio="";

  for (var i=0; i < document.modulo.alunno.length; i++) {
    if (document.modulo.alunno[i].checked) {      
      Str_Giudizio = Str_Giudizio + document.modulo.alunno[i].value;
    }
  }
  for (var i=0; i < document.modulo.interesse.length; i++) {
    if (document.modulo.interesse[i].checked) {
      Str_Giudizio = Str_Giudizio + document.modulo.interesse[i].value;
    }
  }
  for (var i=0; i < document.modulo.dialogo.length; i++) {
    if (document.modulo.dialogo[i].checked) {
      Str_Giudizio = Str_Giudizio + document.modulo.dialogo[i].value;
    }
  }
  for (var i=0; i < document.modulo.attitudine.length; i++) {
    if (document.modulo.attitudine[i].checked) {
      Str_Giudizio = Str_Giudizio + document.modulo.attitudine[i].value;
    }
  }
  for (var i=0; i < document.modulo.applicazione.length; i++) {
    if (document.modulo.applicazione[i].checked) {
      Str_Giudizio = Str_Giudizio + document.modulo.applicazione[i].value;
    }
  }
  for (var i=0; i < document.modulo.assiduità.length; i++) {
    if (document.modulo.assiduità[i].checked) {
    Str_Giudizio = Str_Giudizio + document.modulo.assiduità[i].value;
    }
  }
  for (var i=0; i < document.modulo.preparazione.length; i++) {
    if (document.modulo.preparazione[i].checked) {
      Str_Giudizio = Str_Giudizio + document.modulo.preparazione[i].value;
    }
  }
  for (var i=0; i < document.modulo.provaStr.length; i++) {
    if (document.modulo.provaStr[i].checked) {
      Str_Giudizio = Str_Giudizio + document.modulo.provaStr[i].value;
    }
  }
  for (var i=0; i < document.modulo.esitoProva.length; i++) {
    if (document.modulo.esitoProva[i].checked) {
      Str_Giudizio = Str_Giudizio + document.modulo.esitoProva[i].value;
    }
  }

   document.modulo.giudizio.value=Str_Giudizio;
} //Fine - ScriviGiudizio()

/* Cancella la TextArea dove è scritto il giudizio */
function Cancella() {
  document.modulo.giudizio.value="";
  
  for (var i=0; i < document.modulo.interesse.length; i++) {
    document.modulo.interesse[i].checked=false;
  }
  for (var i=0; i < document.modulo.interesse.length; i++) {
    document.modulo.interesse[i].checked=false;
  }  
  for (var i=0; i < document.modulo.dialogo.length; i++) {
    document.modulo.dialogo[i].checked=false;
  }  
  for (var i=0; i < document.modulo.attitudine.length; i++) {
    document.modulo.attitudine[i].checked=false;
  }
  for (var i=0; i < document.modulo.applicazione.length; i++) {
    document.modulo.applicazione[i].checked=false;
  }
  for (var i=0; i < document.modulo.assiduità.length; i++) {
    document.modulo.assiduità[i].checked=false;
  }
  for (var i=0; i < document.modulo.preparazione.length; i++) {
    document.modulo.preparazione[i].checked=false;
  }
  for (var i=0; i < document.modulo.provaStr.length; i++) {
    document.modulo.provaStr[i].checked=false;
  }
  for (var i=0; i < document.modulo.esitoProva.length; i++) {
    document.modulo.esitoProva[i].checked=false;
  }    
} //Fine - Camcella()
