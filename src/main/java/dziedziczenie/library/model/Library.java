package dziedziczenie.library.model;

import dziedziczenie.library.NoBookFoundException;

public class Library {

    private Item[] items;

    public Library(Item[] items) {
        this.items = items;
    }


    public Item[] searchTheTitle(String title) throws NoBookFoundException {

        if (title != null) {
            int counterOfFoundBooks = 0;
            for (Item item : items) {
                if (item.getTitle().contains(title)) {
                    counterOfFoundBooks++;
                }
            }

            Item[] itemsWithSearchedTitle = new Item[counterOfFoundBooks];
            for (int i = 0; i < items.length; i++) {
                if (items[i].getTitle().contains(title)) {
                    itemsWithSearchedTitle[--counterOfFoundBooks] = items[i];
                }
            }
            if(itemsWithSearchedTitle.length ==0){
                throw new NoBookFoundException();
            }
            return itemsWithSearchedTitle;
        }

        return null;
    }


    public Item[] searchTheAuthor(Author author) {

        if (author != null) {
            int counterOfFoundAuthors = 0;
            for (Item item : items) {
                if (item.getAuthor().equals(author)) {
                    counterOfFoundAuthors++;
                }
            }


            Item[] itemsWithSearchedAuthor = new Item[counterOfFoundAuthors];
            for (int i = 0; i<items.length; i++) {
                if (author.equals(items[i].getAuthor())) {
                    itemsWithSearchedAuthor[--counterOfFoundAuthors] = items[i];
                    }
            }
            return itemsWithSearchedAuthor;
        }
        return null;
    }

    public Item[] searchTheItem(String phrase){
        if(phrase!=null){
            int counterOfFoundItems = 0;
            for(Item item:items){
                if(item.getAuthor().getSurname().equals(phrase)||item.getTitle().contains(phrase)){
                    counterOfFoundItems++;
                }
            }
            Item[] itemsWithSearchedPhrase = new Item[counterOfFoundItems];
            for(int i=0;i<items.length;i++){
                if(phrase.equals(items[i].getAuthor().getName())
                        ||phrase.equals(items[i].getAuthor().getSurname())
                        ||phrase.contains(items[i].getTitle())){
                    itemsWithSearchedPhrase[--counterOfFoundItems] = items[i];
                }
            }
            return itemsWithSearchedPhrase;
        }
       return null;
    }
}
