package com.example.epidemic;

import java.util.List;

public class Info {

    /**
     * reason : success!
     * result : {"data":[{"city_id":"10097","name":"湖北省第三人民医院","province":"湖北","city":"武汉","phone":"027-83743096","address":"湖北省武汉市硚口区中山大道26号"},{"city_id":"10097","name":"湖北省妇幼保健院","province":"湖北","city":"武汉","phone":"027-87169225","address":"湖北省武汉市洪山区武珞路745号"},{"city_id":"10097","name":"湖北省疾病预防控制中心","province":"湖北","city":"武汉","phone":"027-87652023","address":"湖北省武汉市洪山区卓刀泉北路35号"},{"city_id":"10097","name":"湖北省中西医结合医院","province":"湖北","city":"武汉","phone":"027-65600873","address":"湖北省武汉市江汉区菱角湖路11号"},{"city_id":"10097","name":"湖北省中医医院","province":"湖北","city":"武汉","phone":"027-88929057","address":"湖北省武汉市武昌区武昌花园山4号"},{"city_id":"10097","name":"湖北省肿瘤医院","province":"湖北","city":"武汉","phone":"027-87670090","address":"湖北省武汉市洪山区卓刀泉南路116号"},{"city_id":"10097","name":"华大生物科技（武汉）有限公司","province":"湖北","city":"武汉","phone":"027-59273355","address":"湖北省武汉市东湖新技术开发区高新大道666号光谷生物城B2栋"},{"city_id":"10097","name":"华润武钢总医院","province":"湖北","city":"武汉","phone":"027-86487354","address":"湖北省武汉市青山区冶金大道29号"},{"city_id":"10097","name":"华中科技大学同济医学院附属梨园医院","province":"湖北","city":"武汉","phone":"027-86779910","address":"湖北省武汉市东湖生态旅游风景区沿湖路39号"},{"city_id":"10097","name":"华中科技大学同济医学院附属同济医院","province":"湖北","city":"武汉","phone":"027-83662668","address":"湖北省武汉市解放大道1095号"},{"city_id":"10097","name":"华中科技大学同济医学院附属协和医院","province":"湖北","city":"武汉","phone":"027-85726754","address":"湖北省武汉市汉口解放大道1277号"},{"city_id":"10097","name":"空降兵军医院（原空军457医院）","province":"湖北","city":"武汉","phone":"027-83361722","address":"湖北省武汉市汉口工农兵路15号"},{"city_id":"10097","name":"武钢第二职工医院","province":"湖北","city":"武汉","phone":"027-86213018","address":"湖北省武汉市青山区白玉山青化路32号"},{"city_id":"10097","name":"武汉艾迪康医学检验所有限公司","province":"湖北","city":"武汉","phone":"027-83365131","address":"湖北省武汉市江汉经济开发区江兴路17号中信大楼2楼"},{"city_id":"10097","name":"武汉承启医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-59318256","address":"湖北省武汉市江夏区光谷七路与高新二路交叉口"},{"city_id":"10097","name":"武汉大学人民医院","province":"湖北","city":"武汉","phone":"027-88999120","address":"湖北省武汉市武昌区解放路238号"},{"city_id":"10097","name":"武汉大学人民医院（东院）","province":"湖北","city":"武汉","phone":"027-88041911","address":"湖北省武汉市江夏区高新六路"},{"city_id":"10097","name":"武汉大学中南医院","province":"湖北","city":"武汉","phone":"027-67812888","address":"湖北省武汉市武昌区东湖路169号"},{"city_id":"10097","name":"武汉迪安医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-83346055","address":"湖北省湖北省武汉市南泥湾大道63号国际企业峰汇C3"},{"city_id":"10097","name":"武汉儿童医院","province":"湖北","city":"武汉","phone":"027-82433350","address":"湖北省武汉市江岸区香港路100号"},{"city_id":"10097","name":"武汉光谷联合医学检验所有限公司","province":"湖北","city":"武汉","phone":"027-59880039","address":"湖北省武汉市技术开发区高新大道858号生物医药园二期a82-1栋"},{"city_id":"10097","name":"武汉嘉辰医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-87001958","address":"湖北省武汉市东湖高新区高新大道666号B3-1"},{"city_id":"10097","name":"武汉金域医学检验实验室","province":"湖北","city":"武汉","phone":"027-65331936","address":"湖北省武汉沌口经济开发区莲湖路5号"},{"city_id":"10097","name":"武汉凯德维斯医学检验实验室","province":"湖北","city":"武汉","phone":"027-65523439","address":"湖北省武汉市东湖高新区高新二路388号C15栋2层"},{"city_id":"10097","name":"武汉凯普医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-84596828","address":"湖北省武汉市汉阳区黄金口工业园金花路1号（科研楼）厂房1栋4层1室"},{"city_id":"10097","name":"武汉康圣达医学检验所有限公司","province":"湖北","city":"武汉","phone":"027-85573007","address":"湖北省武汉市东湖高新区高新大道666号光谷生物城D2-1"},{"city_id":"10097","name":"武汉康昕瑞医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-65025525","address":"湖北省武汉市东湖新技术开发区高新二路388号生物医药加速器三期21号楼5层"},{"city_id":"10097","name":"武汉科技大学附属天佑医院","province":"湖北","city":"武汉","phone":"027-51228666","address":"湖北省武汉市武昌区涂家岭9号"},{"city_id":"10097","name":"武汉兰丁云医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-87001784","address":"湖北省武汉市东湖新技术开发区高新大道818号高科医疗器械园7号生产孵化楼B7"},{"city_id":"10097","name":"武汉兰卫医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-83347157","address":"湖北省汉口古田二路汇丰企业总部1号楼B座2楼"},{"city_id":"10097","name":"武汉良培医学检验实验室","province":"湖北","city":"武汉","phone":"027-87206915","address":"湖北省武汉市东湖新技术开发区高新大道666号光谷生物城C6-501室"},{"city_id":"10097","name":"武汉美吉同源医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-83086999","address":"湖北省武汉市硚口区工农路6号"},{"city_id":"10097","name":"武汉明志医学检验实验室","province":"湖北","city":"武汉","phone":"027-86699208","address":"湖北省武汉东湖高新开发区高新二路388号生物医药企业加速器1.2期"},{"city_id":"10097","name":"武汉平安好医医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"18963980362","address":"湖北省武汉市江岸区黄浦科技园特23-1号1-2栋3-5层"},{"city_id":"10097","name":"武汉千麦医学检验所有限公司","province":"湖北","city":"武汉","phone":"027-82298739","address":"湖北省武汉市江岸区汉黄路888号岱家山科技城8号楼2楼"},{"city_id":"10097","name":"武汉市蔡甸区人民医院","province":"湖北","city":"武汉","phone":"027-84918001","address":"湖北省武汉市蔡甸区广新福路9号"},{"city_id":"10097","name":"武汉市第六医院","province":"湖北","city":"武汉","phone":"027-82440944","address":"湖北省武汉市汉口江岸区香港路168号"},{"city_id":"10097","name":"武汉市第七医院","province":"湖北","city":"武汉","phone":"027-87362027","address":"湖北省武汉市武昌区武昌中南路二路6号"},{"city_id":"10097","name":"武汉市第三医院","province":"湖北","city":"武汉","phone":"027-68894799","address":"湖北省武汉市武昌彭刘杨路241号"},{"city_id":"10097","name":"武汉市第四医院","province":"湖北","city":"武汉","phone":"13986177267","address":"湖北省武汉市硚口区汉正街473号"},{"city_id":"10097","name":"武汉市第五医院","province":"湖北","city":"武汉","phone":"027-84826104","address":"湖北省武汉市汉阳区显正街122号"},{"city_id":"10097","name":"武汉市第一医院","province":"湖北","city":"武汉","phone":"027-85332222","address":"湖北省武汉市江岸区中山大道215号"},{"city_id":"10097","name":"武汉市肺科医院","province":"湖北","city":"武汉","phone":"027-83660176","address":"湖北省武汉市硚口区宝丰一路28号"},{"city_id":"10097","name":"武汉市汉阳医院","province":"湖北","city":"武汉","phone":"027-84769966","address":"湖北省武汉市汉阳区墨水湖路53号"},{"city_id":"10097","name":"武汉市红十字会医院","province":"湖北","city":"武汉","phone":"027-85877677","address":"湖北省武汉市江岸区香港路392号"},{"city_id":"10097","name":"武汉市黄陂区疾病预防控制中心","province":"湖北","city":"武汉","phone":"027-61002074","address":"湖北省武汉市黄陂区前川百秀街255号"},{"city_id":"10097","name":"武汉市黄陂区人民医院","province":"湖北","city":"武汉","phone":"027-61107867","address":"湖北省武汉市黄陂区百秀街259号"},{"city_id":"10097","name":"武汉市疾病预防控制中心","province":"湖北","city":"武汉","phone":"027-85805111","address":"湖北省武汉市江汉区马场路288号"},{"city_id":"10097","name":"武汉市江夏区第一人民医院","province":"湖北","city":"武汉","phone":"027-87959138","address":"湖北省武汉市江夏区纸坊街新兴街148号"},{"city_id":"10097","name":"武汉市金银潭医院","province":"湖北","city":"武汉","phone":"027-86465341","address":"湖北省武汉市东西湖区金银潭大道1号"},{"city_id":"10097","name":"武汉市九医院","province":"湖北","city":"武汉","phone":"027-68865299","address":"湖北省武汉市青山区吉林街20号"},{"city_id":"10097","name":"武汉市普爱医院","province":"湖北","city":"武汉","phone":"027-83782519","address":"湖北省武汉市硚口区汉正街473号"},{"city_id":"10097","name":"武汉市普仁医院","province":"湖北","city":"武汉","phone":"027-86868999","address":"湖北省武汉市青山区本溪街1号"},{"city_id":"10097","name":"武汉市商职医院","province":"湖北","city":"武汉","phone":"027-85666680","address":"湖北省武汉市江汉区大兴一路13号"},{"city_id":"10097","name":"武汉市思泰得医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-59206863","address":"湖北省武汉市东湖开发区武汉大学科技园武大科技园3S地球空间信息产业基地三区24#座"},{"city_id":"10097","name":"武汉市武昌医院","province":"湖北","city":"武汉","phone":"18162533930","address":"湖北省武汉市武昌区杨园街116号"},{"city_id":"10097","name":"武汉市长江航运总医院","province":"湖北","city":"武汉","phone":"027-82451035","address":"湖北省武汉市江岸区惠济路1号"},{"city_id":"10097","name":"武汉市中西医结合医院","province":"湖北","city":"武汉","phone":"15827307599","address":"湖北省武汉市江岸区中山大道215号"},{"city_id":"10097","name":"武汉市中心医院","province":"湖北","city":"武汉","phone":"027-82811080","address":"湖北省武汉市江岸区胜利街26号"},{"city_id":"10097","name":"武汉市中医医院","province":"湖北","city":"武汉","phone":"027-82851849","address":"湖北省武汉市汉阳区四新大道303号"},{"city_id":"10097","name":"武汉泰康同济医院","province":"湖北","city":"武汉","phone":"13971628932","address":"湖北省武汉市汉阳区四新大道"},{"city_id":"10097","name":"武汉威高永瑞医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-85790098","address":"湖北省武汉市东湖高新技术开发区光谷3路777号光谷保税区生物医药平台5号楼"},{"city_id":"10097","name":"武汉希望组医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-87630353","address":"湖北省武汉市东湖新技术开发区花城大道8号武汉软件新城二期C11栋"},{"city_id":"10097","name":"武汉亚心总医院","province":"湖北","city":"武汉","phone":"027-84788999","address":"湖北省武汉市经济技术开发区太子湖北路300号"},{"city_id":"10097","name":"武汉云晟康医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-81339183","address":"湖北省武汉市江夏经济开发区大桥新区邢远长村工业园"},{"city_id":"10097","name":"武汉中核中同兰博医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-87003295","address":"湖北省武汉市江夏区软件新城花城大道8号"},{"city_id":"10097","name":"武科大附属天佑医院","province":"湖北","city":"武汉","phone":"13971079216","address":"湖北省武汉市武昌区涂家岭9号"},{"city_id":"10097","name":"长江航运总医院","province":"湖北","city":"武汉","phone":"15807150068","address":"湖北省武汉市江岸区惠济路1号"},{"city_id":"10097","name":"中国科学院武汉病毒研究所","province":"湖北","city":"武汉","phone":"027-87298072","address":"湖北省湖北省武汉市武昌区水果湖街小洪山中区44号"}],"city_id":"10097","city":"武汉","province":"湖北"}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * data : [{"city_id":"10097","name":"湖北省第三人民医院","province":"湖北","city":"武汉","phone":"027-83743096","address":"湖北省武汉市硚口区中山大道26号"},{"city_id":"10097","name":"湖北省妇幼保健院","province":"湖北","city":"武汉","phone":"027-87169225","address":"湖北省武汉市洪山区武珞路745号"},{"city_id":"10097","name":"湖北省疾病预防控制中心","province":"湖北","city":"武汉","phone":"027-87652023","address":"湖北省武汉市洪山区卓刀泉北路35号"},{"city_id":"10097","name":"湖北省中西医结合医院","province":"湖北","city":"武汉","phone":"027-65600873","address":"湖北省武汉市江汉区菱角湖路11号"},{"city_id":"10097","name":"湖北省中医医院","province":"湖北","city":"武汉","phone":"027-88929057","address":"湖北省武汉市武昌区武昌花园山4号"},{"city_id":"10097","name":"湖北省肿瘤医院","province":"湖北","city":"武汉","phone":"027-87670090","address":"湖北省武汉市洪山区卓刀泉南路116号"},{"city_id":"10097","name":"华大生物科技（武汉）有限公司","province":"湖北","city":"武汉","phone":"027-59273355","address":"湖北省武汉市东湖新技术开发区高新大道666号光谷生物城B2栋"},{"city_id":"10097","name":"华润武钢总医院","province":"湖北","city":"武汉","phone":"027-86487354","address":"湖北省武汉市青山区冶金大道29号"},{"city_id":"10097","name":"华中科技大学同济医学院附属梨园医院","province":"湖北","city":"武汉","phone":"027-86779910","address":"湖北省武汉市东湖生态旅游风景区沿湖路39号"},{"city_id":"10097","name":"华中科技大学同济医学院附属同济医院","province":"湖北","city":"武汉","phone":"027-83662668","address":"湖北省武汉市解放大道1095号"},{"city_id":"10097","name":"华中科技大学同济医学院附属协和医院","province":"湖北","city":"武汉","phone":"027-85726754","address":"湖北省武汉市汉口解放大道1277号"},{"city_id":"10097","name":"空降兵军医院（原空军457医院）","province":"湖北","city":"武汉","phone":"027-83361722","address":"湖北省武汉市汉口工农兵路15号"},{"city_id":"10097","name":"武钢第二职工医院","province":"湖北","city":"武汉","phone":"027-86213018","address":"湖北省武汉市青山区白玉山青化路32号"},{"city_id":"10097","name":"武汉艾迪康医学检验所有限公司","province":"湖北","city":"武汉","phone":"027-83365131","address":"湖北省武汉市江汉经济开发区江兴路17号中信大楼2楼"},{"city_id":"10097","name":"武汉承启医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-59318256","address":"湖北省武汉市江夏区光谷七路与高新二路交叉口"},{"city_id":"10097","name":"武汉大学人民医院","province":"湖北","city":"武汉","phone":"027-88999120","address":"湖北省武汉市武昌区解放路238号"},{"city_id":"10097","name":"武汉大学人民医院（东院）","province":"湖北","city":"武汉","phone":"027-88041911","address":"湖北省武汉市江夏区高新六路"},{"city_id":"10097","name":"武汉大学中南医院","province":"湖北","city":"武汉","phone":"027-67812888","address":"湖北省武汉市武昌区东湖路169号"},{"city_id":"10097","name":"武汉迪安医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-83346055","address":"湖北省湖北省武汉市南泥湾大道63号国际企业峰汇C3"},{"city_id":"10097","name":"武汉儿童医院","province":"湖北","city":"武汉","phone":"027-82433350","address":"湖北省武汉市江岸区香港路100号"},{"city_id":"10097","name":"武汉光谷联合医学检验所有限公司","province":"湖北","city":"武汉","phone":"027-59880039","address":"湖北省武汉市技术开发区高新大道858号生物医药园二期a82-1栋"},{"city_id":"10097","name":"武汉嘉辰医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-87001958","address":"湖北省武汉市东湖高新区高新大道666号B3-1"},{"city_id":"10097","name":"武汉金域医学检验实验室","province":"湖北","city":"武汉","phone":"027-65331936","address":"湖北省武汉沌口经济开发区莲湖路5号"},{"city_id":"10097","name":"武汉凯德维斯医学检验实验室","province":"湖北","city":"武汉","phone":"027-65523439","address":"湖北省武汉市东湖高新区高新二路388号C15栋2层"},{"city_id":"10097","name":"武汉凯普医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-84596828","address":"湖北省武汉市汉阳区黄金口工业园金花路1号（科研楼）厂房1栋4层1室"},{"city_id":"10097","name":"武汉康圣达医学检验所有限公司","province":"湖北","city":"武汉","phone":"027-85573007","address":"湖北省武汉市东湖高新区高新大道666号光谷生物城D2-1"},{"city_id":"10097","name":"武汉康昕瑞医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-65025525","address":"湖北省武汉市东湖新技术开发区高新二路388号生物医药加速器三期21号楼5层"},{"city_id":"10097","name":"武汉科技大学附属天佑医院","province":"湖北","city":"武汉","phone":"027-51228666","address":"湖北省武汉市武昌区涂家岭9号"},{"city_id":"10097","name":"武汉兰丁云医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-87001784","address":"湖北省武汉市东湖新技术开发区高新大道818号高科医疗器械园7号生产孵化楼B7"},{"city_id":"10097","name":"武汉兰卫医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-83347157","address":"湖北省汉口古田二路汇丰企业总部1号楼B座2楼"},{"city_id":"10097","name":"武汉良培医学检验实验室","province":"湖北","city":"武汉","phone":"027-87206915","address":"湖北省武汉市东湖新技术开发区高新大道666号光谷生物城C6-501室"},{"city_id":"10097","name":"武汉美吉同源医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-83086999","address":"湖北省武汉市硚口区工农路6号"},{"city_id":"10097","name":"武汉明志医学检验实验室","province":"湖北","city":"武汉","phone":"027-86699208","address":"湖北省武汉东湖高新开发区高新二路388号生物医药企业加速器1.2期"},{"city_id":"10097","name":"武汉平安好医医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"18963980362","address":"湖北省武汉市江岸区黄浦科技园特23-1号1-2栋3-5层"},{"city_id":"10097","name":"武汉千麦医学检验所有限公司","province":"湖北","city":"武汉","phone":"027-82298739","address":"湖北省武汉市江岸区汉黄路888号岱家山科技城8号楼2楼"},{"city_id":"10097","name":"武汉市蔡甸区人民医院","province":"湖北","city":"武汉","phone":"027-84918001","address":"湖北省武汉市蔡甸区广新福路9号"},{"city_id":"10097","name":"武汉市第六医院","province":"湖北","city":"武汉","phone":"027-82440944","address":"湖北省武汉市汉口江岸区香港路168号"},{"city_id":"10097","name":"武汉市第七医院","province":"湖北","city":"武汉","phone":"027-87362027","address":"湖北省武汉市武昌区武昌中南路二路6号"},{"city_id":"10097","name":"武汉市第三医院","province":"湖北","city":"武汉","phone":"027-68894799","address":"湖北省武汉市武昌彭刘杨路241号"},{"city_id":"10097","name":"武汉市第四医院","province":"湖北","city":"武汉","phone":"13986177267","address":"湖北省武汉市硚口区汉正街473号"},{"city_id":"10097","name":"武汉市第五医院","province":"湖北","city":"武汉","phone":"027-84826104","address":"湖北省武汉市汉阳区显正街122号"},{"city_id":"10097","name":"武汉市第一医院","province":"湖北","city":"武汉","phone":"027-85332222","address":"湖北省武汉市江岸区中山大道215号"},{"city_id":"10097","name":"武汉市肺科医院","province":"湖北","city":"武汉","phone":"027-83660176","address":"湖北省武汉市硚口区宝丰一路28号"},{"city_id":"10097","name":"武汉市汉阳医院","province":"湖北","city":"武汉","phone":"027-84769966","address":"湖北省武汉市汉阳区墨水湖路53号"},{"city_id":"10097","name":"武汉市红十字会医院","province":"湖北","city":"武汉","phone":"027-85877677","address":"湖北省武汉市江岸区香港路392号"},{"city_id":"10097","name":"武汉市黄陂区疾病预防控制中心","province":"湖北","city":"武汉","phone":"027-61002074","address":"湖北省武汉市黄陂区前川百秀街255号"},{"city_id":"10097","name":"武汉市黄陂区人民医院","province":"湖北","city":"武汉","phone":"027-61107867","address":"湖北省武汉市黄陂区百秀街259号"},{"city_id":"10097","name":"武汉市疾病预防控制中心","province":"湖北","city":"武汉","phone":"027-85805111","address":"湖北省武汉市江汉区马场路288号"},{"city_id":"10097","name":"武汉市江夏区第一人民医院","province":"湖北","city":"武汉","phone":"027-87959138","address":"湖北省武汉市江夏区纸坊街新兴街148号"},{"city_id":"10097","name":"武汉市金银潭医院","province":"湖北","city":"武汉","phone":"027-86465341","address":"湖北省武汉市东西湖区金银潭大道1号"},{"city_id":"10097","name":"武汉市九医院","province":"湖北","city":"武汉","phone":"027-68865299","address":"湖北省武汉市青山区吉林街20号"},{"city_id":"10097","name":"武汉市普爱医院","province":"湖北","city":"武汉","phone":"027-83782519","address":"湖北省武汉市硚口区汉正街473号"},{"city_id":"10097","name":"武汉市普仁医院","province":"湖北","city":"武汉","phone":"027-86868999","address":"湖北省武汉市青山区本溪街1号"},{"city_id":"10097","name":"武汉市商职医院","province":"湖北","city":"武汉","phone":"027-85666680","address":"湖北省武汉市江汉区大兴一路13号"},{"city_id":"10097","name":"武汉市思泰得医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-59206863","address":"湖北省武汉市东湖开发区武汉大学科技园武大科技园3S地球空间信息产业基地三区24#座"},{"city_id":"10097","name":"武汉市武昌医院","province":"湖北","city":"武汉","phone":"18162533930","address":"湖北省武汉市武昌区杨园街116号"},{"city_id":"10097","name":"武汉市长江航运总医院","province":"湖北","city":"武汉","phone":"027-82451035","address":"湖北省武汉市江岸区惠济路1号"},{"city_id":"10097","name":"武汉市中西医结合医院","province":"湖北","city":"武汉","phone":"15827307599","address":"湖北省武汉市江岸区中山大道215号"},{"city_id":"10097","name":"武汉市中心医院","province":"湖北","city":"武汉","phone":"027-82811080","address":"湖北省武汉市江岸区胜利街26号"},{"city_id":"10097","name":"武汉市中医医院","province":"湖北","city":"武汉","phone":"027-82851849","address":"湖北省武汉市汉阳区四新大道303号"},{"city_id":"10097","name":"武汉泰康同济医院","province":"湖北","city":"武汉","phone":"13971628932","address":"湖北省武汉市汉阳区四新大道"},{"city_id":"10097","name":"武汉威高永瑞医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-85790098","address":"湖北省武汉市东湖高新技术开发区光谷3路777号光谷保税区生物医药平台5号楼"},{"city_id":"10097","name":"武汉希望组医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-87630353","address":"湖北省武汉市东湖新技术开发区花城大道8号武汉软件新城二期C11栋"},{"city_id":"10097","name":"武汉亚心总医院","province":"湖北","city":"武汉","phone":"027-84788999","address":"湖北省武汉市经济技术开发区太子湖北路300号"},{"city_id":"10097","name":"武汉云晟康医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-81339183","address":"湖北省武汉市江夏经济开发区大桥新区邢远长村工业园"},{"city_id":"10097","name":"武汉中核中同兰博医学检验实验室有限公司","province":"湖北","city":"武汉","phone":"027-87003295","address":"湖北省武汉市江夏区软件新城花城大道8号"},{"city_id":"10097","name":"武科大附属天佑医院","province":"湖北","city":"武汉","phone":"13971079216","address":"湖北省武汉市武昌区涂家岭9号"},{"city_id":"10097","name":"长江航运总医院","province":"湖北","city":"武汉","phone":"15807150068","address":"湖北省武汉市江岸区惠济路1号"},{"city_id":"10097","name":"中国科学院武汉病毒研究所","province":"湖北","city":"武汉","phone":"027-87298072","address":"湖北省湖北省武汉市武昌区水果湖街小洪山中区44号"}]
         * city_id : 10097
         * city : 武汉
         * province : 湖北
         */

        private String city_id;
        private String city;
        private String province;
        private List<DataBean> data;

        public String getCity_id() {
            return city_id;
        }

        public void setCity_id(String city_id) {
            this.city_id = city_id;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * city_id : 10097
             * name : 湖北省第三人民医院
             * province : 湖北
             * city : 武汉
             * phone : 027-83743096
             * address : 湖北省武汉市硚口区中山大道26号
             */

            private String city_id;
            private String name;
            private String province;
            private String city;
            private String phone;
            private String address;

            public String getCity_id() {
                return city_id;
            }

            public void setCity_id(String city_id) {
                this.city_id = city_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }
        }
    }
}
