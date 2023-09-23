package com.hfad.assignment1_christina_preciosa

class Gradecalc {
    fun calcGarce(score: Double): String{
        if (score >= 94 && score < 100){
            return "A"
        } else if(score >= 90 && score < 94 ) {
            return "A-"
        } else if(score >= 87 && score < 90) {
            return "B+"
        } else if (score >= 83 && score < 87){
            return "B"
        } else if (score >= 80 && score < 83){
            return "B-"
        } else if (score >= 77 && score < 80){
            return "C+"
        } else if (score >=73 && score < 77){
            return "C"
        } else if (score >= 70 && score < 73 ){
            return "C-"
        } else {
            return "F"
        }
    }
}
