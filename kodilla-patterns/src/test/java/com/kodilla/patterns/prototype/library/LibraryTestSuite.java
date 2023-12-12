package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library theListLibrary = new Library("The list");
        /*IntStream.iterate(1, n -> n+1)
                .limit(5)
                .forEach(n -> theListLibrary.books.add(new Book("Title" + n, "Author" + n, LocalDate.now().plusDays(n))));*/

        Book book1 = new Book("Title", "Author", LocalDate.now());
        Book book2 = new Book("TitleII", "AuthorII", LocalDate.now());
        Book book3 = new Book("TitleIII", "AuthorIII", LocalDate.now());

        theListLibrary.getBooks().add(book1);
        theListLibrary.getBooks().add(book2);
        theListLibrary.getBooks().add(book3);

        //making a shallow clone of object board
        Library clonedTheListLibrary = null;
        try {
            clonedTheListLibrary = theListLibrary.shallowCopy();
            clonedTheListLibrary.setName("The list II");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedTheListLibrary = null;
        try {
            deepClonedTheListLibrary = theListLibrary.deepCopy();
            deepClonedTheListLibrary.setName("The list III");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        theListLibrary.getBooks().remove(book1);


        //Then
        System.out.println(theListLibrary);
        System.out.println(clonedTheListLibrary);
        System.out.println(deepClonedTheListLibrary);
        Assert.assertEquals(4, theListLibrary.getBooks().size());
        Assert.assertEquals(4, clonedTheListLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedTheListLibrary.getBooks().size());
        Assert.assertEquals(clonedTheListLibrary.getBooks(), theListLibrary.getBooks());
        Assert.assertNotEquals(deepClonedTheListLibrary.getBooks(), theListLibrary.getBooks());
    }
}