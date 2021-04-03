package org.iesfm.rec2.ej3;

import org.iesfm.rec2.ej3.exceptions.MemberNotFoundException;

public interface ILibrary {

    int countBooksByGenre(String genre);

    Book[] getMemberBookLends(String nif) throws MemberNotFoundException;

}
