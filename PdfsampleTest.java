package com.pdfboxRedener.pdf;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.pdfbox.io.IOUtils;
import org.apache.pdfbox.util.Charsets;


import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;


public class PdfsampleTest {

	public PdfsampleTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		  try (OutputStream os = new FileOutputStream("C:\\DDrive\\Wip\\UUIIDDAAII\\POCs\\pdf\\out.pdf")) {
	            PdfRendererBuilder builder = new PdfRendererBuilder();
	            //builder.useSlowMode();
	            byte[] hdrBytes = IOUtils
	    				.toByteArray(new FileInputStream("C:\\DDrive\\Wip\\UUIIDDAAII\\POCs\\pdf\\sample.html"));
	    		String hdr = new String(hdrBytes, Charsets.UTF_8);
	            builder.withHtmlContent(hdr, null);
	            builder.toStream(os);
	            builder.run();
	        }catch (Exception e) {
				System.out.println(e);
			}

	}

}
