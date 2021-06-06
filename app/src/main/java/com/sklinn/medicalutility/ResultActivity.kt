package com.sklinn.medicalutility

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sklinn.contraceptivechoice.Repositories.SubRepository
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    private lateinit var subRepository: SubRepository

    companion object {
        fun newIntent(context: Context, groupposition: Int, childposition: Int): Intent {
            val intent = Intent(context, ResultActivity::class.java)
            intent.putExtra("group_id", groupposition)
            intent.putExtra("child_id", childposition)
            return intent
        }
    }

    private fun getGroupId() = intent.getIntExtra("group_id",0)
    private fun getChildId()= intent.getIntExtra("child_id",0)

//    private fun getId() = intent.getStringExtra("mainAbbre") ?: "NA"
//    private fun getMainDescriptino() = intent.getStringExtra("mainDescription") ?: "NA"
//    private fun getSubDescription() = intent.getStringExtra("subDescription") ?: "NA"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val groupId = getGroupId().toString()
        val childId = getChildId().toString()

        title = "Group Id = " + groupId + " and child Id = " + childId

//        val id = getId()
//        val mainDesc = getMainDescriptino()
//        val subDesc = getSubDescription()
//
//        title = mainDesc + "," + subDesc
//
//        subRepository = SubRepository()
//        val subCategory = subRepository.getSubCategory(id)
//
//        tvCOC.text = subRepository.transformText(subCategory.COC)
//        cocRemark.text = subRepository.transformText(subCategory.COCRemark ?: "")
//
//        tvPOP.text = subRepository.transformText(subCategory.POP)
//        POPRemark.text = subRepository.transformText(subCategory.POPRemark ?: "")
//
//        tvDMPA.text = subRepository.transformText(subCategory.DMPA)
//        DMPARemark.text = subRepository.transformText(subCategory.DMPARemark ?: "")
//
//        tvImplant.text = subRepository.transformText(subCategory.Implant)
//        ImplantRemark.text = subRepository.transformText(subCategory.ImplantRemark ?: "")
//
//        tvLNGIUD.text = subRepository.transformText(subCategory.LNGIUD)
//        lngiudremark.text = subRepository.transformText(subCategory.LNGIUDRemark ?: "")
//
//        tvCuIUD.text = subRepository.transformText(subCategory.CuIUD)
//        CuIUDRemark.text = subRepository.transformText(subCategory.CuIUDRemark ?: "")

    }
}