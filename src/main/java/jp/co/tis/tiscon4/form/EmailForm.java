package jp.co.tis.tiscon4.form;

import jp.co.tis.tiscon4.common.code.JobType;
import jp.co.tis.tiscon4.common.code.TreatedType;
import nablarch.core.util.StringUtil;
import nablarch.core.validation.ee.Domain;
import nablarch.core.validation.ee.Required;

import javax.validation.constraints.AssertTrue;
import java.io.Serializable;

public class EmailForm implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 漢字氏名 */
    @Required
    @Domain("kanjiName")
    private String kanjiName;

    /** カナ氏名 */
    @Required
    @Domain("kanaName")
    private String kanaName;

    /** 自宅電話番号 */
    @Required
    @Domain("homePhoneNumber")
    private String homePhoneNumber;

    /** 携帯電話番号 */
    @Required
    @Domain("mobilePhoneNumber")
    private String mobilePhoneNumber;

    /** メールアドレス */
    @Required
    @Domain("emailAddress")
    private String emailAddress;


    public String getKanjiName() {
        return kanjiName;
    }

    public void setKanjiName(String kanjiName) {
        this.kanjiName = kanjiName;
    }

    public String getKanaName() {
        return kanaName;
    }

    public void setKanaName(String kanaName) {
        this.kanaName = kanaName;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}
