class Escaper {
    public String escape_special_char(String text) {
        text = text.replaceAll("Á", "&Aacute;");
        text = text.replaceAll("á", "&aacute;");
        text = text.replaceAll("Â", "&Acirc;");
        text = text.replaceAll("â", "&acirc;");
        text = text.replaceAll("À", "&Agrave;");
        text = text.replaceAll("à", "&agrave;");
        text = text.replaceAll("Å", "&Aring;");
        text = text.replaceAll("å", "&aring;");
        text = text.replaceAll("Ã", "&Atilde;");
        text = text.replaceAll("ã", "&atilde;");
        text = text.replaceAll("Ä", "&Auml;");
        text = text.replaceAll("ä", "&auml;");
        text = text.replaceAll("Æ", "&AElig;");
        text = text.replaceAll("æ", "&aelig;");
    
        text = text.replaceAll("É", "&Eacute;");
        text = text.replaceAll("é", "&eacute;");
        text = text.replaceAll("Ê", "&Ecirc;");
        text = text.replaceAll("ê", "&ecirc;");
        text = text.replaceAll("È", "&Egrave;");
        text = text.replaceAll("è", "&egrave;");
        text = text.replaceAll("Ẽ", "&Etilde;");
        text = text.replaceAll("ẽ", "&etilde;");
        text = text.replaceAll("Ë", "&Euml;");
        text = text.replaceAll("ë", "&euml;");
        text = text.replaceAll("Ð", "&ETH;");
        text = text.replaceAll("ð", "&eth;");
            
        text = text.replaceAll("Í", "&Iacute;");
        text = text.replaceAll("í", "&iacute;");
        text = text.replaceAll("Î", "&Icirc;");
        text = text.replaceAll("î", "&icirc;");
        text = text.replaceAll("Ì", "&Igrave;");
        text = text.replaceAll("ì", "&igrave;");
        text = text.replaceAll("Ï", "&Iuml;");
        text = text.replaceAll("ï", "&iuml;");
    
        text = text.replaceAll("Ó", "&Oacute;");
        text = text.replaceAll("ó", "&oacute;");
        text = text.replaceAll("Ô", "&Ocirc;");
        text = text.replaceAll("ô", "&ocirc;");
        text = text.replaceAll("Ò", "&Ograve;");
        text = text.replaceAll("ò", "&ograve;");
        text = text.replaceAll("Ø", "&Oslash;");
        text = text.replaceAll("ø", "&oslash;");
        text = text.replaceAll("Õ", "&Otilde;");
        text = text.replaceAll("õ", "&otilde;");
        text = text.replaceAll("Ö", "&Ouml;");
        text = text.replaceAll("ö", "&ouml;");
            
        text = text.replaceAll("Ú", "&Uacute;");
        text = text.replaceAll("ú", "&uacute;");
        text = text.replaceAll("Û", "&Ucirc;");
        text = text.replaceAll("û", "&ucirc;");
        text = text.replaceAll("Ù", "&Ugrave;");
        text = text.replaceAll("ù", "&ugrave;");
        text = text.replaceAll("Ü", "&Uuml;");
        text = text.replaceAll("ü", "&uuml;");
    
        text = text.replaceAll("Ç", "&Ccedil;");
        text = text.replaceAll("ç", "&ccedil;");
    
        text = text.replaceAll("Ñ", "&Ntilde;");
        text = text.replaceAll("ñ", "&ntilde;");
    
        text = text.replaceAll("<", "&lt;");
        text = text.replaceAll(">", "&gt;");
        text = text.replaceAll("\"", "&quot;");
        text = text.replaceAll("®", "&reg;");
        text = text.replaceAll("©", "&copy;");
    
        text = text.replaceAll("Ý", "&Yacute;");
        text = text.replaceAll("ý", "&yacute;");
    
        text = text.replaceAll("Þ", "&THORN;");
        text = text.replaceAll("þ", "&thorn;");
    
        text = text.replaceAll("ß", "&szlig;");
        System.out.println(text);
        
        return text;
    }
  }