package com.example.stp_converter.converter

class History {

	private val records = mutableListOf<Record>()

	fun addRecord(p1: Int, p2: Int, number1: String, number2: String){
		val record = Record(p1, p2, number1, number2)
		records.add(record)
	}

	fun count() = records.size

	fun clear(){
		records.clear()
	}

	fun history() : List<String> {
		val data = mutableListOf<String>()
		for((ind, i) in records.withIndex()){
			data.add(getString(ind))
		}
		return data
	}

	fun getString(index: Int) = "${records[index].number1}(${records[index].p1}) -> ${records[index].number2}(${records[index].p2})"
}

data class Record(
	val p1: Int,
	val p2: Int,
	val number1: String,
	val number2: String,
)