package WCalc;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

/*import Math.Accessory;
import Math.Calculations;
import Math.FrameColor;
import Math.FrameMaterial;
import Math.FrameType;
import Math.GlassUnit;
import Math.OpeningMechanism;*/
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="Calc", urlPatterns="/JavaCalc")
public class Calc extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestCalc Calc = RequestCalc.fromRequestParameters(request);
		Calc.setAsRequestAttributesAndCalculate(request);
		 
		request.getRequestDispatcher("/Results.jsp").forward(request, response);
		
	}
	
	private static class RequestCalc {
		//private final FrameType frameType;
		private final float height;
		private final float width;
		//private final FrameColor frameColor;
		//private final FrameMaterial frameMaterial;
		//private final GlassUnit glassUnit; // Steklopaket
		//private final Accessory accessory;
		//private final OpeningMechanism type1;
		//private final OpeningMechanism type2;
		//private final OpeningMechanism type3;
		//private final double promocode;
		
		private float result;
						
		private RequestCalc(String frameType,
							float height,
							float width,
							String frameColor,
							String frameMaterial,
							String glassUnit, // Steklopaket
							String accessory,
							String type1,
							String type2,
							String type3,
							String promocode) {
			//this.frameType = FrameType.fromString(frameType);
			this.height = height;
			this.width = width;
			//this.frameColor = FrameColor.fromString(frameColor);
			//this.frameMaterial = FrameMaterial.fromString(frameMaterial);
			//this.glassUnit = GlassUnit.fromString(glassUnit);
			//this.accessory = Accessory.fromString(accessory);
			//this.type1 = OpeningMechanism.fromString(type1);
			//this.type2 = OpeningMechanism.fromString(type2);
			//this.type3 = OpeningMechanism.fromString(type3);
			
			/*if (promocode == "drama_5") {
				this.promocode = 0.95;
			} else if (promocode == "drama_10") {
				this.promocode = 0.9;
			} else {
				this.promocode = 1;
			}*/
		}
		
		public static RequestCalc fromRequestParameters(HttpServletRequest request) {
			return new RequestCalc(request.getParameter("frameType"),
					Float.parseFloat(request.getParameter("height")),
					Float.parseFloat(request.getParameter("width")),
								   request.getParameter("frameColor"),
								   request.getParameter("frameMaterial"),
								   request.getParameter("glassUnit"),
								   request.getParameter("accessory"),
								   request.getParameter("type1"),
								   request.getParameter("type2"),
								   request.getParameter("type3"),
								   request.getParameter("promocode")
			);
		}
				
		public void setAsRequestAttributesAndCalculate(HttpServletRequest request) {

			
			result = height*width;//getFullCost();
			request.setAttribute("result", result);
		}
		
		/*private float getFullCost() {
			List<OpeningMechanism> mechanisms = new ArrayList<OpeningMechanism>();
			if (frameType == FrameType.SINGLELEAF) {
				mechanisms.add(type1);
			} else if (frameType == FrameType.BIVALVE || frameType == FrameType.BIVALVETRANSOM) {
				mechanisms.add(type1);
				mechanisms.add(type2);
			} else {
				mechanisms.add(type1);
				mechanisms.add(type2);
				mechanisms.add(type3);
			}
			
			double frameCost = Calculations.getWindowFrameCost(height, width, frameType, frameMaterial);
			double leafescost = Calculations.getLeafCost(mechanisms);
			double glassCost = Calculations.getGlassUnitCost(height, width, glassUnit);
			double accCost = Calculations.getAccessoriesCost(width, accessory);
			double fullCost = Calculations.getResultSum(frameCost, leafescost, glassCost, accCost, frameColor, promocode);
		return (float) fullCost;
		}*/
	}
}
