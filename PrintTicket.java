import java.io.FileNotFoundException;
import java.io.FileOutputStream;
 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Font; 
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.*;
public class PrintTicket
{
   public void Print(String sFrom, String sTo, String sClass, String iAdult, String iChildren, String iInfant, String sBookingDate, String iPrice, String sTime, String sTicket, String sBook)
   {
       Font redFont = FontFactory.getFont(FontFactory.COURIER, 24, Font.BOLD);
      Document document = new Document();
      try
      {
         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Ticket.pdf"));
         document.open();
         document.add(new Paragraph("Bus Ticket",redFont));
         document.add(new Paragraph("   "));
         document.add(new Paragraph("   "));
         document.add(new Paragraph("   "));
         
         document.add(new Phrase("Pnr Number:  "));
         document.add(new Phrase(sTicket));
         
         document.add(new Paragraph("   "));
         document.add(new Paragraph("   "));
         
         document.add(new Phrase("Boarding Station:  "));
         document.add(new Phrase(sFrom));
         
         document.add(new Paragraph("   "));
         document.add(new Paragraph("   "));
         
         document.add(new Phrase("Departure Time:  "));
         document.add(new Phrase(sTime));
         
         document.add(new Paragraph("   "));
         document.add(new Paragraph("   "));
         
         document.add(new Phrase("Arrival Station:  "));
         document.add(new Phrase(sTo));
         
         document.add(new Paragraph("   "));
         document.add(new Paragraph("   "));
         
         document.add(new Phrase("Class:  "));
         document.add(new Phrase(sClass));
         
         document.add(new Paragraph("   "));
         document.add(new Paragraph("   "));
         
         document.add(new Phrase("Adult:  "));
         document.add(new Phrase(iAdult));
         
         document.add(new Paragraph("   "));
         document.add(new Paragraph("   "));
         
         document.add(new Phrase("Children:  "));
         document.add(new Phrase(iChildren));
         
         document.add(new Paragraph("   "));
         document.add(new Paragraph("   "));
         
         document.add(new Phrase("Infant:  "));
         document.add(new Phrase(iInfant));
         
         document.add(new Paragraph("   "));
         document.add(new Paragraph("   "));
         
         document.add(new Phrase("Travelling Date:  "));
         document.add(new Phrase(sBookingDate));
         
         document.add(new Paragraph("   "));
         document.add(new Paragraph("   "));
         
         document.add(new Phrase("Price:  "));
         document.add(new Phrase(iPrice));
         
         document.add(new Paragraph("   "));
         document.add(new Paragraph("   "));
         
         document.add(new Phrase("Booked by:  "));
         document.add(new Phrase(sBook));
         
         document.add(new Paragraph("   "));
         document.add(new Paragraph("   "));
         
         
         document.close();
         writer.close();
         
         System.out.println("Pdf successfully created");
      } catch (DocumentException e)
      {
         e.printStackTrace();
      } catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
   }
}