package com.example.stp_converter

import com.example.stp_converter.converter.Convert10p
import com.example.stp_converter.converter.History
import org.junit.Assert
import org.junit.Test

class HistoryUnitTest {

	@Test
	fun addRecord(){
		val his = History()
		his.addRecord(5, 16, "123", "123")
		his.addRecord(10, 10, "123", "123")
		val expect = "123(10) -> 123(10)"
		Assert.assertEquals(expect, his.getString(his.count()-1))
	}
}