package com.cuke.users;

import com.cuke.pages.HomePage;
import com.cuke.pages.ResultsPage;
import com.cuke.pages.SearchPage;

public class User {

    public String userName;
    public String password;
    public String email;
    
    private SearchPage searchPage = new SearchPage();
    private ResultsPage resultsPage = new ResultsPage();

    public SearchPage atSearchPage() {
        if (searchPage == null) {
            searchPage = new SearchPage();
        }
        return searchPage;
    }
    
    public ResultsPage atResultsPage() {
        if (resultsPage == null) {
            resultsPage = new ResultsPage();
        }
        return resultsPage;
    }
    
    public HomePage atHomePage() {
        return new HomePage();
    }
    
    public boolean exists() {
        return true;
    }

}
