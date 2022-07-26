package com.ahmed3v.affirmation

import android.content.Context
import com.ahmed3v.affirmation.adapter.ItemAdapter
import com.ahmed3v.affirmation.model.Affirmation
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.mock

class AffirmationsAdapterTests {

    private val context = mock(Context::class.java)

    @Test
   fun adapter_size() {

       val data = listOf(
           Affirmation(R.string.affirmation1, R.drawable.image1),
           Affirmation(R.string.affirmation2, R.drawable.image2)
       )

       val adapter = ItemAdapter(context, data)

        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)

    }
}