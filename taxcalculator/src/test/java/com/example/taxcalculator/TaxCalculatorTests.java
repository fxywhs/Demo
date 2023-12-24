package com.example.taxcalculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import com.example.taxcalculator.entity.TaxCalculatorResponse;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TaxCalculatorTests {
	
	@Autowired
	private TestRestTemplate template;

	@Test
    public void getTaxForCategoryA() throws Exception {
        ResponseEntity<TaxCalculatorResponse> response = template.getForEntity("/tax?annualIncome=2000", TaxCalculatorResponse.class);
        assertThat(response.getBody().getTaxAmount()).isEqualTo(Double.valueOf(0));
        assertThat(response.getBody().getTaxSlab().getCategory()).isEqualTo('A');
    }
	
	@Test
    public void getTaxForCategoryB() throws Exception {
        ResponseEntity<TaxCalculatorResponse> response = template.getForEntity("/tax?annualIncome=18000", TaxCalculatorResponse.class);
        assertThat(response.getBody().getTaxAmount()).isEqualTo(Double.valueOf(130));
        assertThat(response.getBody().getTaxSlab().getCategory()).isEqualTo('B');
    }
	
	@Test
    public void getTaxForCategoryC() throws Exception {
        ResponseEntity<TaxCalculatorResponse> response = template.getForEntity("/tax?annualIncome=30000", TaxCalculatorResponse.class);
        assertThat(response.getBody().getTaxAmount()).isEqualTo(Double.valueOf(450));
        assertThat(response.getBody().getTaxSlab().getCategory()).isEqualTo('C');
    }
	
	@Test
    public void getTaxForCategoryD() throws Exception {
        ResponseEntity<TaxCalculatorResponse> response = template.getForEntity("/tax?annualIncome=38000", TaxCalculatorResponse.class);
        assertThat(response.getBody().getTaxAmount()).isEqualTo(Double.valueOf(780));
        assertThat(response.getBody().getTaxSlab().getCategory()).isEqualTo('D');
    }
	
	@Test
    public void getTaxForCategoryE() throws Exception {
        ResponseEntity<TaxCalculatorResponse> response = template.getForEntity("/tax?annualIncome=65839", TaxCalculatorResponse.class);
        assertThat(response.getBody().getTaxAmount()).isEqualTo(Double.valueOf(3242.29));
        assertThat(response.getBody().getTaxSlab().getCategory()).isEqualTo('E');
    }
	
	@Test
    public void getTaxForCategoryF() throws Exception {
        ResponseEntity<TaxCalculatorResponse> response = template.getForEntity("/tax?annualIncome=80293", TaxCalculatorResponse.class);
        assertThat(response.getBody().getTaxAmount()).isEqualTo(Double.valueOf(5655.67));
        assertThat(response.getBody().getTaxSlab().getCategory()).isEqualTo('F');
    }
	
	@Test
    public void getTaxForCategoryG() throws Exception {
        ResponseEntity<TaxCalculatorResponse> response = template.getForEntity("/tax?annualIncome=352333", TaxCalculatorResponse.class);
        assertThat(response.getBody().getTaxAmount()).isEqualTo(Double.valueOf(72483.25));
        assertThat(response.getBody().getTaxSlab().getCategory()).isEqualTo('G');
    }
	
	@Test
    public void getTaxForCategoryH() throws Exception {
        ResponseEntity<TaxCalculatorResponse> response = template.getForEntity("/tax?annualIncome=523423", TaxCalculatorResponse.class);
        assertThat(response.getBody().getTaxAmount()).isEqualTo(Double.valueOf(116489.98));
        assertThat(response.getBody().getTaxSlab().getCategory()).isEqualTo('H');
    }
	
	@Test
    public void getTaxForCategoryI() throws Exception {
        ResponseEntity<TaxCalculatorResponse> response = template.getForEntity("/tax?annualIncome=700232", TaxCalculatorResponse.class);
        assertThat(response.getBody().getTaxAmount()).isEqualTo(Double.valueOf(164464.96));
        assertThat(response.getBody().getTaxSlab().getCategory()).isEqualTo('I');
    }
	
	@Test
    public void getTaxForCategoryJ() throws Exception {
        ResponseEntity<TaxCalculatorResponse> response = template.getForEntity("/tax?annualIncome=23475991", TaxCalculatorResponse.class);
        assertThat(response.getBody().getTaxAmount()).isEqualTo(Double.valueOf(6971197.3));
        assertThat(response.getBody().getTaxSlab().getCategory()).isEqualTo('J');
    }

}
