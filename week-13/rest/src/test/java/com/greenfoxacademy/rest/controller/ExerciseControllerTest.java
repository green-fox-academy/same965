package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.model.DoublingResponse;
import com.greenfoxacademy.rest.service.RestService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;
import static org.hamcrest.core.Is.is;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@RunWith(SpringRunner.class)
@WebMvcTest(ExerciseController.class)
public class ExerciseControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RestService restService;

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Test
    public void doublingInput() throws Exception {
        DoublingResponse result = new DoublingResponse(4, 8, null);
        when(restService.doublingResponse(any())).thenReturn(result);

        mockMvc.perform(get("/doubling")
                .param("input","4"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType));
    }
}