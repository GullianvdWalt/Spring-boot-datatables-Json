package com.gvdw.datatables_server_side.models.state;

/**
 * @author Gullian Van Der Walt
 * Created at 11:45 on Sep, 2021
 *
 * Class for jQuery DataTable,
 * used for filtered search results
 */
public class Search {

    private String value;
    private String regexp;

    public Search() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRegexp() {
        return regexp;
    }

    public void setRegexp(String regexp) {
        this.regexp = regexp;
    }
}
