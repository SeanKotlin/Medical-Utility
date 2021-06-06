package com.sklinn.medicalutility.Model

class Data {
    fun getlistData(): HashMap<String, List<String>> {

        val listData = HashMap<String, List<String>>()

        val infection = ArrayList<String>()
        infection.add("မီးဖွားနေစဥ် နှင့် မီးဖွားပြီး")
        listData["ရောဂါပိုးဝင်ရောက်ခြင်း"] = infection

        val bf = ArrayList<String>()
        bf.add("၂၄ နာရီအတွင်း")
        bf.add("၄၈ နာရီမှ ၄ ပတ်အတွင်း")
        bf.add("၄ ပတ်မှ ၆ ပတ်အတွင်း")
        bf.add("၆ ပတ်မှ ၆ လအတွင်း")
        listData["မိခင်နို့တိုက်ကျွေးနေပါက"] = bf

        val nobirth = ArrayList<String>()
        nobirth.add("ကလေးမမွေးဖူးသေးသော ")
        listData["ကလေးမေွးဖွားခြင်း ရာ"] = nobirth

        val below18 = ArrayList<String>()
        below18.add("အပျိုဖော်ဝင်ရောက်ချိန်မှ ၁၈ ")
        listData["အသက် ၁၈ နှစ်အော"] = below18

        val bpv = ArrayList<String>()
        bpv.add("မည်သည့်အကြောင်းမှန်း မသီပါ")
        listData["မိန်းမကိုယ်မှ သွေးဆင်းခြင်း"] = bpv

        val solUt = ArrayList<String>()
        solUt.add("သားအိမ်တွင်း အကျိတ်ရှိ")
        listData["သားအိမ်အတွင်း အသားလုံးရှိခြင်း"] = solUt

        val cin = ArrayList<String>()
        cin.add("CIN")
        listData["CIN"] = cin

        val CaCx = ArrayList<String>()
        CaCx.add("မကုသရသေးပါ")
        listData["သားအိမ်ခေါင်းကင်ဆာ"] = CaCx

        val caBreast = ArrayList<String>()
        caBreast.add("လတ်တလော ဖြစ်ပွားနေပါ")
        listData["သားမြတ်ကင်ဆာ"] = caBreast

        val liverds = ArrayList<String>()
        liverds.add("လတ်တလော အသည်းရောင်ခြင်း")
        liverds.add("အသည်းတွင်း အကျိတ်ခဲရှိခြင်း")
        listData["အသည်းရောဂါများ"] = liverds

        val thrombosis = ArrayList<String>()
        thrombosis.add("သွေးခဲခြင်း ရောဂါရာဇဝင်ရှိသူ")
        thrombosis.add("လတ်တလော သွေးခဲရောဂါရှိ")
        thrombosis.add("major surgery လုပ်ဖူး/ငြိမ်သက်စွာ နေနေရသော")
        listData["သွေးခဲခြင်း"] = thrombosis

        val cvd = ArrayList<String>()
        cvd.add("လေဖြန်းခြင်း")
        cvd.add("သွေးကြောကျဥ်း၊ သွေးကြောပိတ်ခြင်း")
        cvd.add("ဖြစ်ပွားစေနိုင်သော အကြောင်းများ ရှိခြင်း")
        listData["နှလုံးသွေးကြော ဦးနှောက်သွေးကြော ရောဂါများ"] = cvd

        val ht = ArrayList<String>()
        ht.add("သာမာန် သွေးတိုးခြင်း")
        ht.add("ပြင်းထန် သွေးတိုးခြင်း")
        listData["သွေးတိုးရောဂါရှိခြင်း"] = ht

        val obesity = ArrayList<String>()
        obesity.add("BMI > 30 ထက် ကျော်သောသူများ")
        listData["အဝလွန်ခြင်း"] = obesity

        val dm = ArrayList<String>()
        dm.add("လတ်တလောဖြစ်ပွားနေသော")
        listData["ဆီးချိုရောဂါ"] = dm

        val smoking = ArrayList<String>()
        smoking.add("အသက် ၃၅ နှစ်အောက်")
        smoking.add("အသက် ၃၅ နှစ်အထက်")
        listData["ဆေးလိပ်သောက်ခြင်း"] = smoking

        val headache = ArrayList<String>()
        headache.add("သာမာန်မှ အလယ်လတ် ‌ခေါင်းကိုက်ခြင်း")
        headache.add("ပြင်းထန် ခေါင်းကိုက်ခြင်း")
        listData["ခေါင်းကိုက်ခြင်း"] = headache

        val drug = ArrayList<String>()
        drug.add("အတက်ကျဆေးများသောက်နေ")
        drug.add("Rifampicin စသော တီဘီရောဂါဆေးများသောက်နေသည် ")
        drug.add("ART ဆေး သောက်သုံးနေပါသည်")
        listData["အခြားသော ဆေးဝါးများ သောက်သုံးနေပါက"] = drug

        val HIV = ArrayList<String>()
        HIV.add("WHO အဆင့် ၃ သို့မဟုတ် ၄")
        listData["HIV ပိုး ရှိခြင်း"] = HIV

        val sti = ArrayList<String>()
        sti.add("ဂနို/ကလာမိုင်ဒီးယား")
        sti.add("အခြားသော ကာလသားရောဂါများနှင့် အရည်ဆင်းခြင်း")
        sti.add("ကာလာသား ရောဂါ ကူးစက်နိင်ခြေများသောသူများ")
        listData["ကာလသားရောဂါ"] = sti

        val gti = ArrayList<String>()
        gti.add("လတ်တလောပိုးဝင်နေခြင်း")
        listData["မွေးလမ်းကြောင်းပိုးဝင်ခြင်း"] = gti

        return listData
    }
}