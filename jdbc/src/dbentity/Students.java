package dbentity;

/**
 * Created by Admin on 2017/8/9.
 */
public class Students {
    private int sid;
    private String sname;
    private String namekey;
    private int sage;
    private String sgender;
    private String sress;
    private String screatetime;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getNamekey() {
        return namekey;
    }

    public void setNamekey(String namekey) {
        this.namekey = namekey;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getSgender() {
        return sgender;
    }

    public void setSgender(String sgender) {
        this.sgender = sgender;
    }

    public String getSress() {
        return sress;
    }

    public void setSress(String sress) {
        this.sress = sress;
    }

    public String getScreatetime() {
        return screatetime;
    }

    public void setScreatetime(String screatetime) {
        this.screatetime = screatetime;
    }

    public Students()
    {

    }
    public Students(int sid, String sname, String namekey, int sage, String sgender, String sress, String screatetime)
    {
        this.sid = sid;
        this.sname = sname;
        this.namekey = namekey;
        this.sage = sage;
        this.sgender = sgender;
        this.sress = sress;
        this.screatetime = screatetime;
    }

}
