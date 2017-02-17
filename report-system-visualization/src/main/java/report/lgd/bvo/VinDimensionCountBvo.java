package report.lgd.bvo;

/**
 * Created by liguodong on 2016/4/3.
 */
public class VinDimensionCountBvo {
    private String province;

    private Integer pv;

    private Integer uvCountry;

    private Integer uvOem;

    private Integer uvYear;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public Integer getUvCountry() {
        return uvCountry;
    }

    public void setUvCountry(Integer uvCountry) {
        this.uvCountry = uvCountry;
    }

    public Integer getUvOem() {
        return uvOem;
    }

    public void setUvOem(Integer uvOem) {
        this.uvOem = uvOem;
    }

    public Integer getUvYear() {
        return uvYear;
    }

    public void setUvYear(Integer uvYear) {
        this.uvYear = uvYear;
    }
}
