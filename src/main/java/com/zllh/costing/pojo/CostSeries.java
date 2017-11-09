package com.zllh.costing.pojo;


/**
 * 菜系表
 * @author wangteng
 *
 */
public class CostSeries {
	/*菜系编号*/
    private String seriesId;
	/*菜系名称*/
    private String seriesName;
	/*是否可用*/
    private Integer effect;

    public String getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId == null ? null : seriesId.trim();
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName == null ? null : seriesName.trim();
    }

    public Integer getEffect() {
        return effect;
    }

    public void setEffect(Integer effect) {
        this.effect = effect;
    }
}