import java.util.ArrayList;
import java.util.List;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {
public Bot() {
	super("6958249447:AAFH-2p0p9njkZvbyucbzXLfOQkfKeUD150");
	}

	public void sendText(Long who, String what){
	   SendMessage sm = SendMessage.builder()
	                    .chatId(who.toString()) //Who are we sending a message to
	                    .text(what).build();    //Message content
	   try {
	        execute(sm);                        //Actually sending the message
	   } catch (TelegramApiException e) {
	        throw new RuntimeException(e);      //Any error will be printed here
	   }}
	
	public void sendMenu(Long who, String txt, InlineKeyboardMarkup kb){
	    SendMessage sm = SendMessage.builder().chatId(who.toString())
	            .parseMode("HTML").text(txt)
	            .replyMarkup(kb).build();

	    try {
	        execute(sm);
	    } catch (TelegramApiException e) {
	        throw new RuntimeException(e);
	    }
	}
	
  @Override
  public String getBotUsername() {
      return "fivedollarvisabot";
  }
  

  
  @Override
  public void onUpdateReceived(Update update) {
	  
	  InlineKeyboardButton Afghanistan = InlineKeyboardButton.builder()
	          .text("Afghanistan \uD83C\uDDE6\uD83C\uDDEB").callbackData("Afghanistan")           
	          .build();
	  
	  InlineKeyboardButton Åland = InlineKeyboardButton.builder()
	          .text("Åland \uD83C\uDDE6\uD83C\uDDFD").callbackData("Åland")           
	          .build();
	  
	  InlineKeyboardButton Albania = InlineKeyboardButton.builder()
	          .text("Albania \uD83C\uDDE6\uD83C\uDDF1").callbackData("Albania")           
	          .build();
	  
	  InlineKeyboardButton Algeria = InlineKeyboardButton.builder()
	          .text("Algeria \uD83C\uDDE9\uD83C\uDDFF").callbackData("Algeria")           
	          .build();
	  
	  InlineKeyboardButton American_Samoa = InlineKeyboardButton.builder()
	          .text("American Samoa \uD83C\uDDE6\uD83C\uDDF8").callbackData("American_Samoa")           
	          .build();
	  
	  InlineKeyboardButton Andorra = InlineKeyboardButton.builder()
	          .text("Andorra \uD83C\uDDE6\uD83C\uDDE9").callbackData("Andorra")           
	          .build();
	  
	  InlineKeyboardButton Angola = InlineKeyboardButton.builder()
	          .text("Angola \uD83C\uDDE6\uD83C\uDDF4").callbackData("Angola")           
	          .build();
	  
	  InlineKeyboardButton Anguilla = InlineKeyboardButton.builder()
	          .text("Anguilla \uD83C\uDDE6\uD83C\uDDEE").callbackData("Anguilla")           
	          .build();
	  
	  InlineKeyboardButton Antigua_and_Barbuda = InlineKeyboardButton.builder()
	          .text("Antigua and Barbuda \uD83C\uDDE6\uD83C\uDDEC").callbackData("Antigua_and_Barbuda")           
	          .build();
	  
	  InlineKeyboardButton Argentina = InlineKeyboardButton.builder()
	          .text("Argentina \uD83C\uDDE6\uD83C\uDDF7").callbackData("Argentina")           
	          .build();
	  
	  InlineKeyboardButton Armenia = InlineKeyboardButton.builder()
	          .text("Armenia \uD83C\uDDE6\uD83C\uDDF2").callbackData("Armenia")           
	          .build();
	  
	  InlineKeyboardButton Aruba = InlineKeyboardButton.builder()
	          .text("Aruba \uD83C\uDDE6\uD83C\uDDFC").callbackData("Aruba")           
	          .build();
	  
	  InlineKeyboardButton Australia = InlineKeyboardButton.builder()
	          .text("Australia \uD83C\uDDE6\uD83C\uDDFA").callbackData("Australia")           
	          .build();
	  
	  InlineKeyboardButton Austria = InlineKeyboardButton.builder()
	          .text("Austria \uD83C\uDDE6\uD83C\uDDF9").callbackData("Austria")           
	          .build();
	  
	  InlineKeyboardButton Azerbaijan = InlineKeyboardButton.builder()
	          .text("Azerbaijan \uD83C\uDDE6\uD83C\uDDFF").callbackData("Azerbaijan")           
	          .build();
	  
	  InlineKeyboardButton Bahamas = InlineKeyboardButton.builder()
	          .text("Bahamas \uD83C\uDDE7\uD83C\uDDF8").callbackData("Bahamas")           
	          .build();
	  
	  InlineKeyboardButton Bahrain = InlineKeyboardButton.builder()
	          .text("Bahrain \uD83C\uDDE7\uD83C\uDDED").callbackData("Bahrain")           
	          .build();
	  
	  InlineKeyboardButton Bangladesh = InlineKeyboardButton.builder()
	          .text("Bangladesh \uD83C\uDDE7\uD83C\uDDE9").callbackData("Bangladesh")           
	          .build();
	  
	  InlineKeyboardButton Barbados = InlineKeyboardButton.builder()
	          .text("Barbados \uD83C\uDDE7\uD83C\uDDE7").callbackData("Barbados")           
	          .build();
	  
	  InlineKeyboardButton Belarus = InlineKeyboardButton.builder()
	          .text("Belarus \uD83C\uDDE7\uD83C\uDDFE").callbackData("Belarus")           
	          .build();
	  
	  InlineKeyboardButton Belgium = InlineKeyboardButton.builder()
	          .text("Belgium \uD83C\uDDE7\uD83C\uDDEA").callbackData("Belgium")           
	          .build();
	  
	  InlineKeyboardButton Belize = InlineKeyboardButton.builder()
	          .text("Belize \uD83C\uDDE7\uD83C\uDDFF").callbackData("Belize")           
	          .build();
	  
	  InlineKeyboardButton Benin = InlineKeyboardButton.builder()
	          .text("Benin \uD83C\uDDE7\uD83C\uDDEF").callbackData("Benin")           
	          .build();
	  
	  InlineKeyboardButton Bermuda = InlineKeyboardButton.builder()
	          .text("Bermuda \uD83C\uDDE7\uD83C\uDDF2").callbackData("Bermuda")           
	          .build();
	  
	  InlineKeyboardButton Bhutan = InlineKeyboardButton.builder()
	          .text("Bhutan \uD83C\uDDE7\uD83C\uDDF9").callbackData("Bhutan")           
	          .build();
	  
	  InlineKeyboardButton Bolivia = InlineKeyboardButton.builder()
	          .text("Bolivia \uD83C\uDDE7\uD83C\uDDF4").callbackData("Bolivia")           
	          .build();
	  
	  InlineKeyboardButton Bonaire = InlineKeyboardButton.builder()
	          .text("Bonaire \uD83C\uDDE7\uD83C\uDDF6").callbackData("Bonaire")           
	          .build();
	  
	  InlineKeyboardButton Bosnia_and_Herzegovina = InlineKeyboardButton.builder()
	          .text("Bosnia and Herzegovina \uD83C\uDDE7\uD83C\uDDE6").callbackData("Bosnia_and_Herzegovina")           
	          .build();
	  
	  InlineKeyboardButton Botswana = InlineKeyboardButton.builder()
	          .text("Botswana \uD83C\uDDE7\uD83C\uDDFC").callbackData("Botswana")           
	          .build();
	  
	  InlineKeyboardButton Brazil = InlineKeyboardButton.builder()
	          .text("Brazil \uD83C\uDDE7\uD83C\uDDF7").callbackData("Brazil")           
	          .build();
	  
	  InlineKeyboardButton British_Indian_Ocean_Territory = InlineKeyboardButton.builder()
	          .text("British Indian Ocean Territory \uD83C\uDDEE\uD83C\uDDF4").callbackData("British_Indian_Ocean_Territory")           
	          .build();
	  
	  InlineKeyboardButton British_Virgin_Islands = InlineKeyboardButton.builder()
	          .text("British Virgin Islands \uD83C\uDDFB\uD83C\uDDEC").callbackData("British_Virgin_Islands")           
	          .build();
	  
	  InlineKeyboardButton Brunei = InlineKeyboardButton.builder()
	          .text("Brunei \uD83C\uDDE7\uD83C\uDDF3").callbackData("Brunei")           
	          .build();
	  
	  InlineKeyboardButton Bulgaria = InlineKeyboardButton.builder()
	          .text("Bulgaria \uD83C\uDDE7\uD83C\uDDEC").callbackData("Bulgaria")           
	          .build();
	  
	  InlineKeyboardButton Burkina_Faso = InlineKeyboardButton.builder()
	          .text("Burkina Faso \uD83C\uDDE7\uD83C\uDDEB").callbackData("Burkina_Faso")           
	          .build();
	  
	  InlineKeyboardButton Burundi = InlineKeyboardButton.builder()
	          .text("Burundi \uD83C\uDDE7\uD83C\uDDEE").callbackData("Burundi")           
	          .build();
	  
	  InlineKeyboardButton Cambodia = InlineKeyboardButton.builder()
	          .text("Cambodia \uD83C\uDDF0\uD83C\uDDED").callbackData("Cambodia")           
	          .build();
	  
	  InlineKeyboardButton Cameroon = InlineKeyboardButton.builder()
	          .text("Cameroon \uD83C\uDDE8\uD83C\uDDF2").callbackData("Cameroon")           
	          .build();
	  
	  InlineKeyboardButton Canada = InlineKeyboardButton.builder()
	          .text("Canada \uD83C\uDDE8\uD83C\uDDE6").callbackData("Canada")           
	          .build();
	  
	  InlineKeyboardButton Cape_Verde = InlineKeyboardButton.builder()
	          .text("Cape Verde \uD83C\uDDE8\uD83C\uDDFB").callbackData("Cape_Verde")           
	          .build();
	  
	  InlineKeyboardButton Central_African_Republic = InlineKeyboardButton.builder()
	          .text("Central African Republic \uD83C\uDDE8\uD83C\uDDEB").callbackData("Central_African_Republic")           
	          .build();
	  
	  InlineKeyboardButton Chad = InlineKeyboardButton.builder()
	          .text("Chad \uD83C\uDDF9\uD83C\uDDE9").callbackData("Chad")           
	          .build();
	  
	  InlineKeyboardButton Chile = InlineKeyboardButton.builder()
	          .text("Chile \uD83C\uDDE8\uD83C\uDDF1").callbackData("Chile")           
	          .build();
	  
	  InlineKeyboardButton China = InlineKeyboardButton.builder()
	          .text("China \uD83C\uDDE8\uD83C\uDDF3").callbackData("China")           
	          .build();
	  
	  InlineKeyboardButton Colombia = InlineKeyboardButton.builder()
	          .text("Colombia \uD83C\uDDE8\uD83C\uDDF4").callbackData("Colombia")           
	          .build();
	  
	  InlineKeyboardButton Comoros = InlineKeyboardButton.builder()
	          .text("Comoros \uD83C\uDDF0\uD83C\uDDF2").callbackData("Comoros")           
	          .build();
	  
	  InlineKeyboardButton Democratic_Republic_of_the_Congo = InlineKeyboardButton.builder()
	          .text("Democratic Republic of the Congo \uD83C\uDDE8\uD83C\uDDE9").callbackData("Democratic_Republic_of_the_Congo")           
	          .build();
	  
	  InlineKeyboardButton Republic_of_the_Congo = InlineKeyboardButton.builder()
	          .text("Republic of the Congo \uD83C\uDDE8\uD83C\uDDEC").callbackData("Republic_of_the_Congo")           
	          .build();
	  
	  InlineKeyboardButton Costa_Rica = InlineKeyboardButton.builder()
	          .text("Costa Rica \uD83C\uDDE8\uD83C\uDDF7").callbackData("Costa_Rica")           
	          .build();
	  
	  InlineKeyboardButton Croatia = InlineKeyboardButton.builder()
	          .text("Croatia \uD83C\uDDED\uD83C\uDDF7").callbackData("Croatia")           
	          .build();
	  
	  InlineKeyboardButton Cuba = InlineKeyboardButton.builder()
	          .text("Cuba \uD83C\uDDE8\uD83C\uDDFA").callbackData("Cuba")           
	          .build();
	  
	  InlineKeyboardButton Curaçao = InlineKeyboardButton.builder()
	          .text("Curaçao \uD83C\uDDE8\uD83C\uDDFC").callbackData("Curaçao")           
	          .build();
	  
	  InlineKeyboardButton Cyprus = InlineKeyboardButton.builder()
	          .text("Cyprus \uD83C\uDDE8\uD83C\uDDFE").callbackData("Cyprus")           
	          .build();
	  
	  InlineKeyboardButton Czech_Republic = InlineKeyboardButton.builder()
	          .text("Czech Republic \uD83C\uDDE8\uD83C\uDDFF").callbackData("Czech_Republic")           
	          .build();
	  
	  InlineKeyboardButton Denmark = InlineKeyboardButton.builder()
	          .text("Denmark \uD83C\uDDE9\\uD83C\uDDF0F").callbackData("Denmark")           
	          .build();
	  
	  InlineKeyboardButton Djibouti = InlineKeyboardButton.builder()
	          .text("Djibouti \uD83C\uDDE9\uD83C\uDDEF").callbackData("Djibouti")           
	          .build();
	  
	  InlineKeyboardButton Dominica = InlineKeyboardButton.builder()
	          .text("Dominica \uD83C\uDDE9\uD83C\uDDF2").callbackData("Dominica")           
	          .build();
	  
	  InlineKeyboardButton Dominican_Republic = InlineKeyboardButton.builder()
	          .text("Dominican Republic \uD83C\uDDE9\uD83C\uDDF4").callbackData("Dominican_Republic")           
	          .build();
	  
	  InlineKeyboardButton East_Timor = InlineKeyboardButton.builder()
	          .text("East Timor \uD83C\uDDF9\uD83C\uDDF1").callbackData("East_Timor")           
	          .build();
	  
	  InlineKeyboardButton Ecuador = InlineKeyboardButton.builder()
	          .text("Ecuador \uD83C\uDDEA\uD83C\uDDE8").callbackData("Ecuador")           
	          .build();
	  
	  InlineKeyboardButton Egypt = InlineKeyboardButton.builder()
	          .text("Egypt \uD83C\uDDEA\uD83C\uDDEC").callbackData("Egypt")           
	          .build();
	  
	  InlineKeyboardButton El_Salvador = InlineKeyboardButton.builder()
	          .text("El Salvador \uD83C\uDDF8\uD83C\uDDFB").callbackData("El_Salvador")           
	          .build();
	  
	  InlineKeyboardButton Equatorial_Guinea = InlineKeyboardButton.builder()
	          .text("Equatorial Guinea \uD83C\uDDEC\uD83C\uDDF6").callbackData("Equatorial_Guinea")           
	          .build();
	  
	  InlineKeyboardButton Eritrea = InlineKeyboardButton.builder()
	          .text("Eritrea \uD83C\uDDEA\uD83C\uDDF7").callbackData("Eritrea")           
	          .build();
	  
	  InlineKeyboardButton Estonia = InlineKeyboardButton.builder()
	          .text("Estonia \uD83C\uDDEA\uD83C\uDDEA").callbackData("Estonia")           
	          .build();
	  
	  InlineKeyboardButton Eswatini = InlineKeyboardButton.builder()
	          .text("Eswatini \uD83C\uDDF8\uD83C\uDDFF").callbackData("Eswatini")           
	          .build();
	  
	  InlineKeyboardButton Ethiopia = InlineKeyboardButton.builder()
	          .text("Ethiopia \uD83C\uDDEA\uD83C\uDDF9").callbackData("Ethiopia")           
	          .build();
	  
	  InlineKeyboardButton Fiji = InlineKeyboardButton.builder()
	          .text("Fiji \uD83C\uDDEB\uD83C\uDDEF").callbackData("Fiji")           
	          .build();
	  
	  InlineKeyboardButton Finland = InlineKeyboardButton.builder()
	          .text("Finland \uD83C\uDDEB\uD83C\uDDEE").callbackData("Finland")           
	          .build();
	  
	  InlineKeyboardButton France = InlineKeyboardButton.builder()
	          .text("France \uD83C\uDDEB\uD83C\uDDF7").callbackData("France")           
	          .build();
	  
	  InlineKeyboardButton Gabon = InlineKeyboardButton.builder()
	          .text("Gabon \uD83C\uDDEC\uD83C\uDDE6").callbackData("Gabon")           
	          .build();
	  
	  InlineKeyboardButton Gambia = InlineKeyboardButton.builder()
	          .text("Gambia \uD83C\uDDEC\uD83C\uDDF2").callbackData("Gambia")           
	          .build();
	  
	  InlineKeyboardButton Georgia = InlineKeyboardButton.builder()
	          .text("Georgia \uD83C\uDDEC\uD83C\uDDEA").callbackData("Georgia")           
	          .build();
	  
	  InlineKeyboardButton Germany = InlineKeyboardButton.builder()
	          .text("Germany \uD83C\uDDE9\uD83C\uDDEA").callbackData("Germany")           
	          .build();
	  
	  InlineKeyboardButton Ghana = InlineKeyboardButton.builder()
	          .text("Ghana \uD83C\uDDEC\uD83C\uDDED").callbackData("Ghana")           
	          .build();
	  
	  InlineKeyboardButton Greece = InlineKeyboardButton.builder()
	          .text("Greece \uD83C\uDDEC\uD83C\uDDF7").callbackData("Greece")           
	          .build();
	  
	  InlineKeyboardButton Grenada = InlineKeyboardButton.builder()
	          .text("Grenada \uD83C\uDDEC\uD83C\uDDE9").callbackData("Grenada")           
	          .build();
	  
	  InlineKeyboardButton Guatemala = InlineKeyboardButton.builder()
	          .text("Guatemala \uD83C\uDDEC\uD83C\uDDF9").callbackData("Guatemala")           
	          .build();
	  
	  InlineKeyboardButton Guinea = InlineKeyboardButton.builder()
	          .text("Guinea \uD83C\uDDEC\uD83C\uDDF3").callbackData("Guinea")           
	          .build();
	  
	  InlineKeyboardButton Guinea_Bissau = InlineKeyboardButton.builder()
	          .text("Guinea Bissau \uD83C\uDDEC\uD83C\uDDFC").callbackData("Guinea_Bissau")           
	          .build();
	  
	  InlineKeyboardButton Guyana = InlineKeyboardButton.builder()
	          .text("Guyana \uD83C\uDDEC\uD83C\uDDFE").callbackData("Guyana")           
	          .build();
	  
	  InlineKeyboardButton Haiti = InlineKeyboardButton.builder()
	          .text("Haiti \uD83C\uDDED\uD83C\uDDF9").callbackData("Haiti")           
	          .build();
	  
	  InlineKeyboardButton Honduras = InlineKeyboardButton.builder()
	          .text("Honduras \uD83C\uDDED\uD83C\uDDF3").callbackData("Honduras")           
	          .build();
	  
	  InlineKeyboardButton Hong_Kong = InlineKeyboardButton.builder()
	          .text("Hong Kong \uD83C\uDDED\uD83C\uDDF0").callbackData("Hong_Kong")           
	          .build();
	  
	  InlineKeyboardButton Hungary = InlineKeyboardButton.builder()
	          .text("Hungary \uD83C\uDDED\uD83C\uDDFA").callbackData("Hungary")           
	          .build();
	  
	  InlineKeyboardButton Iceland = InlineKeyboardButton.builder()
	          .text("Iceland \uD83C\uDDEE\uD83C\uDDF8").callbackData("Iceland")           
	          .build();
	  
	  InlineKeyboardButton India = InlineKeyboardButton.builder()
	          .text("India \uD83C\uDDEE\uD83C\uDDF3").callbackData("India")           
	          .build();
	  
	  InlineKeyboardButton Indonesia = InlineKeyboardButton.builder()
	          .text("Indonesia \uD83C\uDDEE\uD83C\uDDE9").callbackData("Indonesia")           
	          .build();
	  
	  InlineKeyboardButton Iran = InlineKeyboardButton.builder()
	          .text("Iran \uD83C\uDDEE\uD83C\uDDF7").callbackData("Iran")           
	          .build();
	  
	  InlineKeyboardButton Iraq = InlineKeyboardButton.builder()
	          .text("Iraq \uD83C\uDDEE\uD83C\uDDF6").callbackData("Iraq")           
	          .build();
	  
	  InlineKeyboardButton Ireland = InlineKeyboardButton.builder()
	          .text("Ireland \uD83C\uDDEE\uD83C\uDDEA").callbackData("Ireland")           
	          .build();
	  
	  InlineKeyboardButton Israel = InlineKeyboardButton.builder()
	          .text("Israel \uD83C\uDDEE\uD83C\uDDF1").callbackData("Israel")           
	          .build();
	  
	  InlineKeyboardButton Italy = InlineKeyboardButton.builder()
	          .text("Italy \uD83C\uDDEE\uD83C\uDDF9").callbackData("Italy")           
	          .build();
	  
	  InlineKeyboardButton Ivory_Coast = InlineKeyboardButton.builder()
	          .text("Ivory Coast \uD83C\uDDE8\uD83C\uDDEE").callbackData("Ivory_Coast")           
	          .build();
	  
	  InlineKeyboardButton Jamaica = InlineKeyboardButton.builder()
	          .text("Jamaica \uD83C\uDDEF\uD83C\uDDF2").callbackData("Jamaica")           
	          .build();
	  
	  InlineKeyboardButton Japan = InlineKeyboardButton.builder()
	          .text("Japan \uD83C\uDDEF\uD83C\uDDF5").callbackData("Japan")           
	          .build();
	  
	  InlineKeyboardButton Jordan = InlineKeyboardButton.builder()
	          .text("Jordan \uD83C\uDDEF\uD83C\uDDF4").callbackData("Jordan")           
	          .build();
	  
	  InlineKeyboardButton Kazakhstan = InlineKeyboardButton.builder()
	          .text("Kazakhstan \uD83C\uDDF0\uD83C\uDDFF").callbackData("Kazakhstan")           
	          .build();
	  
	  InlineKeyboardButton Kenya = InlineKeyboardButton.builder()
	          .text("Kenya \uD83C\uDDF0\uD83C\uDDEA").callbackData("Kenya")           
	          .build();
	  
	  InlineKeyboardButton Kiribati = InlineKeyboardButton.builder()
	          .text("Kiribati \uD83C\uDDF0\uD83C\uDDEE").callbackData("Kiribati")           
	          .build();
	  
	  InlineKeyboardButton North_Korea = InlineKeyboardButton.builder()
	          .text("North Korea \uD83C\uDDF0\uD83C\uDDF5").callbackData("North_Korea")           
	          .build();
	  
	  InlineKeyboardButton South_Korea = InlineKeyboardButton.builder()
	          .text("South Korea \uD83C\uDDF0\uD83C\uDDF7").callbackData("South_Korea")           
	          .build();
	  
	  InlineKeyboardButton Kuwait = InlineKeyboardButton.builder()
	          .text("Kuwait \uD83C\uDDF0\uD83C\uDDFC").callbackData("Kuwait")           
	          .build();
	  
	  InlineKeyboardButton Kyrgyzstan = InlineKeyboardButton.builder()
	          .text("Kyrgyzstan \uD83C\uDDF0\uD83C\uDDEC").callbackData("Kyrgyzstan")           
	          .build();
	  
	  InlineKeyboardButton Laos = InlineKeyboardButton.builder()
	          .text("Laos \uD83C\uDDF1\uD83C\uDDE6").callbackData("Laos")           
	          .build();
	  
	  InlineKeyboardButton Latvia = InlineKeyboardButton.builder()
	          .text("Latvia \uD83C\uDDF1\uD83C\uDDFB").callbackData("Latvia")           
	          .build();
	  
	  InlineKeyboardButton Lebanon = InlineKeyboardButton.builder()
	          .text("Lebanon \uD83C\uDDF1\uD83C\uDDE7").callbackData("Lebanon")           
	          .build();
	  
	  InlineKeyboardButton Lesotho = InlineKeyboardButton.builder()
	          .text("Lesotho \uD83C\uDDF1\uD83C\uDDF8").callbackData("Lesotho")           
	          .build();
	  
	  InlineKeyboardButton Liberia = InlineKeyboardButton.builder()
	          .text("Liberia \uD83C\uDDF1\uD83C\uDDF7").callbackData("Liberia")           
	          .build();
	  
	  InlineKeyboardButton Libya = InlineKeyboardButton.builder()
	          .text("Libya \uD83C\uDDF1\uD83C\uDDFE").callbackData("Libya")           
	          .build();
	  
	  InlineKeyboardButton Liechtenstein = InlineKeyboardButton.builder()
	          .text("Liechtenstein \uD83C\uDDF1\uD83C\uDDEE").callbackData("Liechtenstein")           
	          .build();
	  
	  InlineKeyboardButton Lithuania = InlineKeyboardButton.builder()
	          .text("Lithuania \uD83C\uDDF1\uD83C\uDDF9").callbackData("Lithuania")           
	          .build();
	  
	  InlineKeyboardButton Luxembourg = InlineKeyboardButton.builder()
	          .text("Luxembourg \uD83C\uDDF1\uD83C\uDDFA").callbackData("Luxembourg")           
	          .build();
	  
	  InlineKeyboardButton Macau = InlineKeyboardButton.builder()
	          .text("Macau \uD83C\uDDF2\uD83C\uDDF4").callbackData("Macau")           
	          .build();
	  
	  InlineKeyboardButton Madagascar = InlineKeyboardButton.builder()
	          .text("Madagascar \uD83C\uDDF2\uD83C\uDDEC").callbackData("Madagascar")           
	          .build();
	  
	  InlineKeyboardButton Malawi = InlineKeyboardButton.builder()
	          .text("Malawi \uD83C\uDDF2\uD83C\uDDFC").callbackData("Malawi")           
	          .build();
	  
	  InlineKeyboardButton Malaysia = InlineKeyboardButton.builder()
	          .text("Malaysia \uD83C\uDDF2\uD83C\uDDFE").callbackData("Malaysia")           
	          .build();
	  
	  InlineKeyboardButton Maldives = InlineKeyboardButton.builder()
	          .text("Maldives \uD83C\uDDF2\uD83C\uDDFB").callbackData("Maldives")           
	          .build();
	  
	  InlineKeyboardButton Mali = InlineKeyboardButton.builder()
	          .text("Mali \uD83C\uDDF2\uD83C\uDDF1").callbackData("Mali")           
	          .build();
	  
	  InlineKeyboardButton Malta = InlineKeyboardButton.builder()
	          .text("Malta \uD83C\uDDF2\uD83C\uDDF9").callbackData("Malta")           
	          .build();
	  
	  InlineKeyboardButton Marshall_Islands = InlineKeyboardButton.builder()
	          .text("Marshall Islands \uD83C\uDDF2\uD83C\uDDED").callbackData("Marshall_Islands")           
	          .build();
	  
	  InlineKeyboardButton Martinique = InlineKeyboardButton.builder()
	          .text("Martinique \uD83C\uDDF2\uD83C\uDDF6").callbackData("Martinique")           
	          .build();
	  
	  InlineKeyboardButton Mauritania = InlineKeyboardButton.builder()
	          .text("Mauritania \uD83C\uDDF2\uD83C\uDDF7").callbackData("Mauritania")           
	          .build();
	  
	  InlineKeyboardButton Mauritius = InlineKeyboardButton.builder()
	          .text("Mauritius \uD83C\uDDF2\uD83C\uDDFA").callbackData("Mauritius")           
	          .build();
	  
	  InlineKeyboardButton Mexico = InlineKeyboardButton.builder()
	          .text("Mexico \uD83C\uDDF2\uD83C\uDDFD").callbackData("Mexico")           
	          .build();
	  
	  InlineKeyboardButton Micronesia = InlineKeyboardButton.builder()
	          .text("Micronesia \uD83C\uDDEB\uD83C\uDDF2").callbackData("Micronesia")           
	          .build();
	  
	  InlineKeyboardButton Moldova = InlineKeyboardButton.builder()
	          .text("Moldova \uD83C\uDDF2\uD83C\uDDE9").callbackData("Moldova")           
	          .build();
	  
	  InlineKeyboardButton Monaco = InlineKeyboardButton.builder()
	          .text("Monaco \uD83C\uDDF2\uD83C\uDDE8").callbackData("Monaco")           
	          .build();
	  
	  InlineKeyboardButton Mongolia = InlineKeyboardButton.builder()
	          .text("Mongolia \uD83C\uDDF2\uD83C\uDDF3").callbackData("Mongolia")           
	          .build();
	  
	  InlineKeyboardButton Montenegro = InlineKeyboardButton.builder()
	          .text("Montenegro \uD83C\uDDF2\uD83C\uDDEA").callbackData("Montenegro")           
	          .build();
	  
	  InlineKeyboardButton Morocco = InlineKeyboardButton.builder()
	          .text("Morocco \uD83C\uDDF2\uD83C\uDDE6").callbackData("Morocco")           
	          .build();
	  
	  InlineKeyboardButton Mozambique = InlineKeyboardButton.builder()
	          .text("Mozambique \uD83C\uDDF2\uD83C\uDDFF").callbackData("Mozambique")           
	          .build();
	  
	  InlineKeyboardButton Myanmar = InlineKeyboardButton.builder()
	          .text("Myanmar \uD83C\uDDF2\uD83C\uDDF2").callbackData("Myanmar")           
	          .build();
	  
	  InlineKeyboardButton Namibia = InlineKeyboardButton.builder()
	          .text("Namibia \uD83C\uDDF3\uD83C\uDDE6").callbackData("Namibia")           
	          .build();
	  
	  InlineKeyboardButton Nauru = InlineKeyboardButton.builder()
	          .text("Nauru \uD83C\uDDF3\uD83C\uDDF7").callbackData("Nauru")           
	          .build();
	  
	  InlineKeyboardButton Nepal = InlineKeyboardButton.builder()
	          .text("Nepal \uD83C\uDDF3\uD83C\uDDF5").callbackData("Nepal")           
	          .build();
	  
	  InlineKeyboardButton Netherlands = InlineKeyboardButton.builder()
	          .text("Netherlands \uD83C\uDDF3\uD83C\uDDF1").callbackData("Netherlands")           
	          .build();
	  
	  InlineKeyboardButton New_Caledonia = InlineKeyboardButton.builder()
	          .text("New Caledonia \uD83C\uDDF3\uD83C\uDDE8").callbackData("New_Caledonia")           
	          .build();
	  
	  InlineKeyboardButton New_Zealand = InlineKeyboardButton.builder()
	          .text("New Zealand \uD83C\uDDF3\uD83C\uDDFF").callbackData("New_Zealand")           
	          .build();
	  
	  InlineKeyboardButton Nicaragua = InlineKeyboardButton.builder()
	          .text("Nicaragua \uD83C\uDDF3\uD83C\uDDEE").callbackData("Nicaragua")           
	          .build();
	  
	  InlineKeyboardButton Niger = InlineKeyboardButton.builder()
	          .text("Niger \uD83C\uDDF3\uD83C\uDDEA").callbackData("Niger")           
	          .build();
	  
	  InlineKeyboardButton Nigeria = InlineKeyboardButton.builder()
	          .text("Nigeria \uD83C\uDDF3\uD83C\uDDEC").callbackData("Nigeria")           
	          .build();
	  
	  InlineKeyboardButton Norfolk_Island = InlineKeyboardButton.builder()
	          .text("Norfolk Island \uD83C\uDDF3\uD83C\uDDEB").callbackData("Norfolk_Island")           
	          .build();
	  
	  InlineKeyboardButton North_Macedonia = InlineKeyboardButton.builder()
	          .text("North Macedonia \uD83C\uDDF3\uD83C\uDDEB").callbackData("North_Macedonia")           
	          .build();
	  
	  InlineKeyboardButton Norway = InlineKeyboardButton.builder()
	          .text("Norway \uD83C\uDDF3\uD83C\uDDF4").callbackData("Norway")           
	          .build();
	  
	  InlineKeyboardButton Oman = InlineKeyboardButton.builder()
	          .text("Oman \uD83C\uDDF4\uD83C\uDDF2").callbackData("Oman")           
	          .build();
	  
	  InlineKeyboardButton Pakistan = InlineKeyboardButton.builder()
	          .text("Pakistan \uD83C\uDDF5\uD83C\uDDF0").callbackData("Pakistan")           
	          .build();
	  
	  InlineKeyboardButton Palau = InlineKeyboardButton.builder()
	          .text("Palau \uD83C\uDDF5\uD83C\uDDFC").callbackData("Palau")           
	          .build();
	  
	  InlineKeyboardButton Palestine = InlineKeyboardButton.builder()
	          .text("Palestine \uD83C\uDDF5\uD83C\uDDF8").callbackData("Palestine")           
	          .build();
	  
	  InlineKeyboardButton Panama = InlineKeyboardButton.builder()
	          .text("Panama \uD83C\uDDF5\uD83C\uDDE6").callbackData("Panama")           
	          .build();
	  
	  InlineKeyboardButton Papua_New_Guinea = InlineKeyboardButton.builder()
	          .text("Papua New Guinea \uD83C\uDDF5\uD83C\uDDEC").callbackData("Papua_New_Guinea")           
	          .build();
	  
	  InlineKeyboardButton Paraguay = InlineKeyboardButton.builder()
	          .text("Paraguay \uD83C\uDDF5\uD83C\uDDFE").callbackData("Paraguay")           
	          .build();
	  
	  InlineKeyboardButton Peru = InlineKeyboardButton.builder()
	          .text("Peru \uD83C\uDDF5\uD83C\uDDEA").callbackData("Peru")           
	          .build();
	  
	  InlineKeyboardButton Philippines = InlineKeyboardButton.builder()
	          .text("Philippines \uD83C\uDDF5\uD83C\uDDED").callbackData("Philippines")           
	          .build();
	  
	  InlineKeyboardButton Poland = InlineKeyboardButton.builder()
	          .text("Poland \uD83C\uDDF5\uD83C\uDDF1").callbackData("Poland")           
	          .build();
	  
	  InlineKeyboardButton Portugal = InlineKeyboardButton.builder()
	          .text("Portugal \uD83C\uDDF5\uD83C\uDDF9").callbackData("Portugal")           
	          .build();
	  
	  InlineKeyboardButton Qatar = InlineKeyboardButton.builder()
	          .text("Qatar \uD83C\uDDF6\uD83C\uDDE6").callbackData("Qatar")           
	          .build();
	  
	  InlineKeyboardButton Réunion = InlineKeyboardButton.builder()
	          .text("Réunion \uD83C\uDDF7\uD83C\uDDEA").callbackData("Réunion")           
	          .build();
	  
	  InlineKeyboardButton Romania = InlineKeyboardButton.builder()
	          .text("Romania \uD83C\uDDF7\uD83C\uDDF4").callbackData("Romania")           
	          .build();
	  
	  InlineKeyboardButton Russia = InlineKeyboardButton.builder()
	          .text("Russia \uD83C\uDDF7\uD83C\uDDFA").callbackData("Russia")           
	          .build();
	  
	  InlineKeyboardButton Rwanda = InlineKeyboardButton.builder()
	          .text("Rwanda \uD83C\uDDF7\uD83C\uDDFC").callbackData("Rwanda")           
	          .build();
	  
	  InlineKeyboardButton Saint_Kitts_and_Nevis = InlineKeyboardButton.builder()
	          .text("Saint Kitts and Nevis \uD83C\uDDF0\uD83C\uDDF3").callbackData("Saint_Kitts_and_Nevis")           
	          .build();
	  
	  InlineKeyboardButton Saint_Lucia = InlineKeyboardButton.builder()
	          .text("Saint Lucia \uD83C\uDDF1\uD83C\uDDE8").callbackData("Saint_Lucia")           
	          .build();
	  
	  InlineKeyboardButton Saint_Vincent_and_the_Grenadines = InlineKeyboardButton.builder()
	          .text("Saint Vincent and the Grenadines \uD83C\uDDFB\uD83C\uDDE8").callbackData("Saint_Vincent_and_the_Grenadines")           
	          .build();
	  
	  InlineKeyboardButton Samoa = InlineKeyboardButton.builder()
	          .text("Samoa \uD83C\uDDFC\uD83C\uDDF8").callbackData("Samoa")           
	          .build();
	  
	  InlineKeyboardButton San_Marino = InlineKeyboardButton.builder()
	          .text("San Marino \uD83C\uDDF8\uD83C\uDDF2").callbackData("San_Marino")           
	          .build();
	  
	  InlineKeyboardButton São_Tomé_and_Príncipe = InlineKeyboardButton.builder()
	          .text("São Tomé and Príncipe \uD83C\uDDF8\uD83C\uDDF9").callbackData("São_Tomé_and_Príncipe")           
	          .build();
	  
	  InlineKeyboardButton Saudi_Arabia = InlineKeyboardButton.builder()
	          .text("Saudi Arabia \uD83C\uDDF8\uD83C\uDDE6").callbackData("Saudi_Arabia")           
	          .build();
	  
	  InlineKeyboardButton Senegal = InlineKeyboardButton.builder()
	          .text("Senegal \uD83C\uDDF8\uD83C\uDDF3").callbackData("Senegal")           
	          .build();
	  
	  InlineKeyboardButton Serbia = InlineKeyboardButton.builder()
	          .text("Serbia \uD83C\uDDF7\uD83C\uDDF8").callbackData("Serbia")           
	          .build();
	  
	  InlineKeyboardButton Seychelles = InlineKeyboardButton.builder()
	          .text("Seychelles \uD83C\uDDF8\uD83C\uDDE8").callbackData("Seychelles")           
	          .build();
	  
	  InlineKeyboardButton Sierra_Leone = InlineKeyboardButton.builder()
	          .text("Sierra Leone \uD83C\uDDF8\uD83C\uDDF1").callbackData("Sierra_Leone")           
	          .build();
	  
	  InlineKeyboardButton Singapore = InlineKeyboardButton.builder()
	          .text("Singapore \uD83C\uDDF8\uD83C\uDDEC").callbackData("Singapore")           
	          .build();
	  
	  InlineKeyboardButton Slovakia = InlineKeyboardButton.builder()
	          .text("Slovakia \uD83C\uDDF8\uD83C\uDDF0").callbackData("Slovakia")           
	          .build();
	  
	  InlineKeyboardButton Slovenia = InlineKeyboardButton.builder()
	          .text("Slovenia \uD83C\uDDF8\uD83C\uDDEE").callbackData("Slovenia")           
	          .build();
	  
	  InlineKeyboardButton Solomon_Islands = InlineKeyboardButton.builder()
	          .text("Solomon Islands \uD83C\uDDF8\uD83C\uDDE7").callbackData("Solomon_Islands")           
	          .build();
	  
	  InlineKeyboardButton Somalia = InlineKeyboardButton.builder()
	          .text("Somalia \uD83C\uDDF8\uD83C\uDDF4").callbackData("Somalia")           
	          .build();
	  
	  InlineKeyboardButton South_Africa = InlineKeyboardButton.builder()
	          .text("South Africa \uD83C\uDDFF\uD83C\uDDE6").callbackData("South_Africa")           
	          .build();
	  
	  InlineKeyboardButton South_Sudan = InlineKeyboardButton.builder()
	          .text("South Sudan \uD83C\uDDF8\uD83C\uDDF8").callbackData("South_Sudan")           
	          .build();
	  
	  InlineKeyboardButton Spain = InlineKeyboardButton.builder()
	          .text("Spain \uD83C\uDDEA\uD83C\uDDF8").callbackData("Spain")           
	          .build();
	  
	  InlineKeyboardButton Sri_Lanka = InlineKeyboardButton.builder()
	          .text("Sri Lanka \uD83C\uDDF1\uD83C\uDDF0").callbackData("Sri_Lanka")           
	          .build();
	  
	  InlineKeyboardButton Sudan = InlineKeyboardButton.builder()
	          .text("Sudan \uD83C\uDDF8\uD83C\uDDE9").callbackData("Sudan")           
	          .build();
	  
	  InlineKeyboardButton Suriname = InlineKeyboardButton.builder()
	          .text("Suriname \uD83C\uDDF8\uD83C\uDDF7").callbackData("Suriname")           
	          .build();
	  
	  InlineKeyboardButton Sweden = InlineKeyboardButton.builder()
	          .text("Sweden \uD83C\uDDF8\uD83C\uDDEA").callbackData("Sweden")           
	          .build();
	  
	  InlineKeyboardButton Switzerland = InlineKeyboardButton.builder()
	          .text("Switzerland \uD83C\uDDE8\uD83C\uDDED").callbackData("Switzerland")           
	          .build();
	  
	  InlineKeyboardButton Syria = InlineKeyboardButton.builder()
	          .text("Syria \uD83C\uDDF8\uD83C\uDDFE").callbackData("Syria")           
	          .build();
	  
	  InlineKeyboardButton Saint_Martin = InlineKeyboardButton.builder()
	          .text("Saint Martin \uD83C\uDDF2\uD83C\uDDEB").callbackData("Saint_Martin")           
	          .build();
	  
	  InlineKeyboardButton Sint_Maarten = InlineKeyboardButton.builder()
	          .text("Sint Maarten \uD83C\uDDF8\uD83C\uDDFD").callbackData("Sint_Maarten")           
	          .build();
	  
	  InlineKeyboardButton Tajikistan = InlineKeyboardButton.builder()
	          .text("Tajikistan \uD83C\uDDF9\uD83C\uDDEF").callbackData("Tajikistan")           
	          .build();
	  
	  InlineKeyboardButton Tanzania = InlineKeyboardButton.builder()
	          .text("Tanzania \uD83C\uDDF9\uD83C\uDDFF").callbackData("Tanzania")           
	          .build();
	  
	  InlineKeyboardButton Thailand = InlineKeyboardButton.builder()
	          .text("Thailand \uD83C\uDDF9\uD83C\uDDED").callbackData("Thailand")           
	          .build();
	  
	  InlineKeyboardButton Togo = InlineKeyboardButton.builder()
	          .text("Togo \uD83C\uDDF9\uD83C\uDDEC").callbackData("Togo")           
	          .build();
	  
	  InlineKeyboardButton Tonga = InlineKeyboardButton.builder()
	          .text("Tonga \uD83C\uDDF9\uD83C\uDDF4").callbackData("Tonga")           
	          .build();
	  
	  InlineKeyboardButton Trinidad_and_Tobago = InlineKeyboardButton.builder()
	          .text("Trinidad and Tobago \uD83C\uDDF9\uD83C\uDDF9").callbackData("Trinidad_and_Tobago")           
	          .build();
	  
	  InlineKeyboardButton Tunisia = InlineKeyboardButton.builder()
	          .text("Tunisia \uD83C\uDDF9\uD83C\uDDF3").callbackData("Tunisia")           
	          .build();
	  
	  InlineKeyboardButton Turkey = InlineKeyboardButton.builder()
	          .text("Turkey \uD83C\uDDF9\uD83C\uDDF7").callbackData("Turkey")           
	          .build();
	  
	  InlineKeyboardButton Turkmenistan = InlineKeyboardButton.builder()
	          .text("Turkmenistan \uD83C\uDDF9\uD83C\uDDF2").callbackData("Turkmenistan")           
	          .build();
	  
	  InlineKeyboardButton Tuvalu = InlineKeyboardButton.builder()
	          .text("Tuvalu \uD83C\uDDF9\uD83C\uDDFB").callbackData("Tuvalu")           
	          .build();
	  
	  InlineKeyboardButton Uganda = InlineKeyboardButton.builder()
	          .text("Uganda \uD83C\uDDFA\uD83C\uDDEC").callbackData("Uganda")           
	          .build();
	  
	  InlineKeyboardButton Ukraine = InlineKeyboardButton.builder()
	          .text("Ukraine \uD83C\uDDFA\uD83C\uDDE6").callbackData("Ukraine")           
	          .build();
	  
	  InlineKeyboardButton United_Arab_Emirates = InlineKeyboardButton.builder()
	          .text("United Arab Emirates \uD83C\uDDE6\uD83C\uDDEA").callbackData("United_Arab_Emirates")           
	          .build();
	  
	  InlineKeyboardButton United_Kingdom = InlineKeyboardButton.builder()
	          .text("United Kingdom \uD83C\uDDEC\uD83C\uDDE7").callbackData("United_Kingdom")           
	          .build();
	  
	  InlineKeyboardButton Uruguay = InlineKeyboardButton.builder()
	          .text("Uruguay \uD83C\uDDFA\uD83C\uDDFE").callbackData("Uruguay")           
	          .build();
	  
	  InlineKeyboardButton Uzbekistan = InlineKeyboardButton.builder()
	          .text("Uzbekistan \uD83C\uDDFA\uD83C\uDDFF").callbackData("Uzbekistan")           
	          .build();
	  
	  InlineKeyboardButton Vanuatu = InlineKeyboardButton.builder()
	          .text("Vanuatu \uD83C\uDDFB\uD83C\uDDFA").callbackData("Vanuatu")           
	          .build();
	  
	  InlineKeyboardButton Vatican_City = InlineKeyboardButton.builder()
	          .text("Vatican City \uD83C\uDDFB\uD83C\uDDE6").callbackData("Vatican_City")           
	          .build();
	  
	  InlineKeyboardButton Venezuela = InlineKeyboardButton.builder()
	          .text("Venezuela \uD83C\uDDFB\uD83C\uDDEA").callbackData("Venezuela")           
	          .build();
	  
	  InlineKeyboardButton Vietnam = InlineKeyboardButton.builder()
	          .text("Vietnam \uD83C\uDDFB\uD83C\uDDF3").callbackData("Vietnam")           
	          .build();

	  InlineKeyboardButton Wales = InlineKeyboardButton.builder()
	          .text("Wales \uD83C\uDFF4\uDB40\uDC67\uDB40\uDC62\uDB40\uDC77\uDB40\uDC6C\uDB40\uDC73\uDB40\uDC7F").callbackData("Wales")           
	          .build();
	  
	  InlineKeyboardButton Wallis_and_Futuna = InlineKeyboardButton.builder()
	          .text("Wallis and Futuna \uD83C\uDDFC\uD83C\uDDEB").callbackData("Wallis_and_Futuna")           
	          .build();
	  
	  InlineKeyboardButton Western_Sahara = InlineKeyboardButton.builder()
	          .text("Western Sahara \uD83C\uDDEA\uD83C\uDDED").callbackData("Western_Sahara")           
	          .build();
	  
	  InlineKeyboardButton Yemen = InlineKeyboardButton.builder()
	          .text("Yemen \uD83C\uDDFE\uD83C\uDDEA").callbackData("Yemen")           
	          .build();
	  
	  InlineKeyboardButton Zambia = InlineKeyboardButton.builder()
	          .text("Zambia \uD83C\uDDFF\uD83C\uDDF2").callbackData("Zambia")           
	          .build();
	  
	  InlineKeyboardButton Zimbabwe = InlineKeyboardButton.builder()
	          .text("Zimbabwe \uD83C\uDDFF\uD83C\uDDFC").callbackData("Zimbabwe")           
	          .build();
	  
	  List<List<InlineKeyboardButton>> buttons1 = new ArrayList<>();
	  List<List<InlineKeyboardButton>> buttons2 = new ArrayList<>();
	  List<List<InlineKeyboardButton>> buttons3 = new ArrayList<>();
	  
	  List<InlineKeyboardButton> button1 = new ArrayList<>();
      button1.add(Afghanistan);
      buttons1.add(button1);
      
	  List<InlineKeyboardButton> button2 = new ArrayList<>();
      button2.add(Åland);
      buttons1.add(button2);
      
	  List<InlineKeyboardButton> button3 = new ArrayList<>();
      button3.add(Albania);
      buttons1.add(button3);
      
	  List<InlineKeyboardButton> button4 = new ArrayList<>();
      button4.add(Algeria);
      buttons1.add(button4);
      
	  List<InlineKeyboardButton> button5 = new ArrayList<>();
      button5.add(American_Samoa);
      buttons1.add(button5);
      
	  List<InlineKeyboardButton> button6 = new ArrayList<>();
      button6.add(Andorra);
      buttons1.add(button6);
      
	  List<InlineKeyboardButton> button7 = new ArrayList<>();
      button7.add(Angola);
      buttons1.add(button7);
      
	  List<InlineKeyboardButton> button8 = new ArrayList<>();
      button8.add(Anguilla);
      buttons1.add(button8);
      
	  List<InlineKeyboardButton> button9 = new ArrayList<>();
      button9.add(Antigua_and_Barbuda);
      buttons1.add(button9);
      
	  List<InlineKeyboardButton> button10 = new ArrayList<>();
      button10.add(Argentina);
      buttons1.add(button10);
      
	  List<InlineKeyboardButton> button11 = new ArrayList<>();
      button11.add(Armenia);
      buttons1.add(button11);
      
	  List<InlineKeyboardButton> button12 = new ArrayList<>();
      button12.add(Aruba);
      buttons1.add(button12);
      
	  List<InlineKeyboardButton> button13 = new ArrayList<>();
      button13.add(Australia);
      buttons1.add(button13);
      
	  List<InlineKeyboardButton> button14 = new ArrayList<>();
      button14.add(Austria);
      buttons1.add(button14);
      
	  List<InlineKeyboardButton> button15 = new ArrayList<>();
      button15.add(Azerbaijan);
      buttons1.add(button15);
      
	  List<InlineKeyboardButton> button16 = new ArrayList<>();
      button16.add(Bahamas);
      buttons1.add(button16);
      
	  List<InlineKeyboardButton> button17 = new ArrayList<>();
      button17.add(Bahrain);
      buttons1.add(button17);
      
	  List<InlineKeyboardButton> button18 = new ArrayList<>();
      button18.add(Bangladesh);
      buttons1.add(button18);
      
	  List<InlineKeyboardButton> button19 = new ArrayList<>();
      button19.add(Barbados);
      buttons1.add(button19);
      
	  List<InlineKeyboardButton> button20 = new ArrayList<>();
      button20.add(Belarus);
      buttons1.add(button20);
      
	  List<InlineKeyboardButton> button21 = new ArrayList<>();
      button21.add(Belgium);
      buttons1.add(button21);
      
	  List<InlineKeyboardButton> button22 = new ArrayList<>();
      button22.add(Belize);
      buttons1.add(button22);
      
	  List<InlineKeyboardButton> button23 = new ArrayList<>();
      button23.add(Benin);
      buttons1.add(button23);
      
	  List<InlineKeyboardButton> button24 = new ArrayList<>();
      button24.add(Bermuda);
      buttons1.add(button24);
      
	  List<InlineKeyboardButton> button25 = new ArrayList<>();
      button25.add(Bhutan);
      buttons1.add(button25);
      
	  List<InlineKeyboardButton> button26 = new ArrayList<>();
      button26.add(Bolivia);
      buttons1.add(button26);
      
	  List<InlineKeyboardButton> button27 = new ArrayList<>();
      button27.add(Bonaire);
      buttons1.add(button27);
      
	  List<InlineKeyboardButton> button28 = new ArrayList<>();
      button28.add(Bosnia_and_Herzegovina);
      buttons1.add(button28);
      
	  List<InlineKeyboardButton> button29 = new ArrayList<>();
      button29.add(Botswana);
      buttons1.add(button29);
      
	  List<InlineKeyboardButton> button30 = new ArrayList<>();
      button30.add(Brazil);
      buttons1.add(button30);
      
	  List<InlineKeyboardButton> button31 = new ArrayList<>();
      button31.add(British_Indian_Ocean_Territory);
      buttons1.add(button31);
      
	  List<InlineKeyboardButton> button32 = new ArrayList<>();
      button32.add(British_Virgin_Islands);
      buttons1.add(button32);
      
	  List<InlineKeyboardButton> button33 = new ArrayList<>();
      button33.add(Brunei);
      buttons1.add(button33);
      
	  List<InlineKeyboardButton> button34 = new ArrayList<>();
      button34.add(Bulgaria);
      buttons1.add(button34);
      
	  List<InlineKeyboardButton> button35 = new ArrayList<>();
      button35.add(Burkina_Faso);
      buttons1.add(button35);
      
	  List<InlineKeyboardButton> button36 = new ArrayList<>();
      button36.add(Burundi);
      buttons1.add(button36);
      
	  List<InlineKeyboardButton> button37 = new ArrayList<>();
      button37.add(Cambodia);
      buttons1.add(button37);
      
	  List<InlineKeyboardButton> button38 = new ArrayList<>();
      button38.add(Cameroon);
      buttons1.add(button38);
      
	  List<InlineKeyboardButton> button39 = new ArrayList<>();
      button39.add(Canada);
      buttons1.add(button39);
      
	  List<InlineKeyboardButton> button40 = new ArrayList<>();
      button40.add(Cape_Verde);
      buttons1.add(button40);
      
	  List<InlineKeyboardButton> button41 = new ArrayList<>();
      button41.add(Central_African_Republic);
      buttons1.add(button41);
      
	  List<InlineKeyboardButton> button42 = new ArrayList<>();
      button42.add(Chad);
      buttons1.add(button42);
      
	  List<InlineKeyboardButton> button43 = new ArrayList<>();
      button43.add(Chile);
      buttons1.add(button43);
      
	  List<InlineKeyboardButton> button44 = new ArrayList<>();
      button44.add(China);
      buttons1.add(button44);
      
	  List<InlineKeyboardButton> button45 = new ArrayList<>();
      button45.add(Colombia);
      buttons1.add(button45);
      
	  List<InlineKeyboardButton> button46 = new ArrayList<>();
      button46.add(Comoros);
      buttons1.add(button46);
      
	  List<InlineKeyboardButton> button47 = new ArrayList<>();
      button47.add(Democratic_Republic_of_the_Congo);
      buttons1.add(button47);
      
	  List<InlineKeyboardButton> button48 = new ArrayList<>();
      button48.add(Republic_of_the_Congo);
      buttons1.add(button48);
      
	  List<InlineKeyboardButton> button49 = new ArrayList<>();
      button49.add(Costa_Rica);
      buttons1.add(button49);
      
	  List<InlineKeyboardButton> button50 = new ArrayList<>();
      button50.add(Croatia);
      buttons1.add(button50);
      
	  List<InlineKeyboardButton> button51 = new ArrayList<>();
      button51.add(Cuba);
      buttons1.add(button51);
      
	  List<InlineKeyboardButton> button52 = new ArrayList<>();
      button52.add(Curaçao);
      buttons1.add(button52);
      
	  List<InlineKeyboardButton> button53 = new ArrayList<>();
      button53.add(Cyprus);
      buttons1.add(button53);
      
	  List<InlineKeyboardButton> button54 = new ArrayList<>();
      button54.add(Czech_Republic);
      buttons1.add(button54);
      
	  List<InlineKeyboardButton> button55 = new ArrayList<>();
      button55.add(Denmark);
      buttons1.add(button55);
      
	  List<InlineKeyboardButton> button56 = new ArrayList<>();
      button56.add(Djibouti);
      buttons1.add(button56);
      
	  List<InlineKeyboardButton> button57 = new ArrayList<>();
      button57.add(Dominica);
      buttons1.add(button57);
      
	  List<InlineKeyboardButton> button58 = new ArrayList<>();
      button58.add(Dominican_Republic);
      buttons1.add(button58);
      
	  List<InlineKeyboardButton> button59 = new ArrayList<>();
      button59.add(East_Timor);
      buttons1.add(button59);
      
	  List<InlineKeyboardButton> button60 = new ArrayList<>();
      button60.add(Ecuador);
      buttons1.add(button60);
      
	  List<InlineKeyboardButton> button61 = new ArrayList<>();
      button61.add(Egypt);
      buttons1.add(button61);
      
	  List<InlineKeyboardButton> button62 = new ArrayList<>();
      button62.add(El_Salvador);
      buttons1.add(button62);
      
	  List<InlineKeyboardButton> button63 = new ArrayList<>();
      button63.add(Equatorial_Guinea);
      buttons1.add(button63);
      
	  List<InlineKeyboardButton> button64 = new ArrayList<>();
      button64.add(Eritrea);
      buttons1.add(button64);
      
	  List<InlineKeyboardButton> button65 = new ArrayList<>();
      button65.add(Estonia);
      buttons1.add(button65);
      
	  List<InlineKeyboardButton> button66 = new ArrayList<>();
      button66.add(Eswatini);
      buttons1.add(button66);
      
	  List<InlineKeyboardButton> button67 = new ArrayList<>();
      button67.add(Ethiopia);
      buttons1.add(button67);
      
	  List<InlineKeyboardButton> button68 = new ArrayList<>();
      button68.add(Fiji);
      buttons1.add(button68);
      
	  List<InlineKeyboardButton> button69 = new ArrayList<>();
      button69.add(Finland);
      buttons1.add(button69);
      
	  List<InlineKeyboardButton> button70 = new ArrayList<>();
      button70.add(France);
      buttons1.add(button70);
      
	  List<InlineKeyboardButton> button71 = new ArrayList<>();
      button71.add(Gabon);
      buttons1.add(button71);
      
	  List<InlineKeyboardButton> button72 = new ArrayList<>();
      button72.add(Gambia);
      buttons1.add(button72);
      
	  List<InlineKeyboardButton> button73 = new ArrayList<>();
      button73.add(Georgia);
      buttons1.add(button73);
      
	  List<InlineKeyboardButton> button74 = new ArrayList<>();
      button74.add(Germany);
      buttons1.add(button74);
      
	  List<InlineKeyboardButton> button75 = new ArrayList<>();
      button75.add(Ghana);
      buttons1.add(button75);
      
	  List<InlineKeyboardButton> button76 = new ArrayList<>();
      button76.add(Greece);
      buttons1.add(button76);
      
	  List<InlineKeyboardButton> button77 = new ArrayList<>();
      button77.add(Grenada);
      buttons1.add(button77);
      
	  List<InlineKeyboardButton> button78 = new ArrayList<>();
      button78.add(Guatemala);
      buttons1.add(button78);
      
	  List<InlineKeyboardButton> button79 = new ArrayList<>();
      button79.add(Guinea);
      buttons1.add(button79);
      
	  List<InlineKeyboardButton> button80 = new ArrayList<>();
      button80.add(Guinea_Bissau);
      buttons1.add(button80);
      
	  List<InlineKeyboardButton> button81 = new ArrayList<>();
      button81.add(Guyana);
      buttons1.add(button81);
      
	  List<InlineKeyboardButton> button82 = new ArrayList<>();
      button82.add(Haiti);
      buttons1.add(button82);
      
	  List<InlineKeyboardButton> button83 = new ArrayList<>();
      button83.add(Honduras);
      buttons1.add(button83);
      
	  List<InlineKeyboardButton> button84 = new ArrayList<>();
      button84.add(Hong_Kong);
      buttons1.add(button84);
      
	  List<InlineKeyboardButton> button85 = new ArrayList<>();
      button85.add(Hungary);
      buttons1.add(button85);
      
	  List<InlineKeyboardButton> button86 = new ArrayList<>();
      button86.add(Iceland);
      buttons1.add(button86);
      
	  List<InlineKeyboardButton> button87 = new ArrayList<>();
      button87.add(India);
      buttons1.add(button87);
      
	  List<InlineKeyboardButton> button88 = new ArrayList<>();
      button88.add(Indonesia);
      buttons1.add(button88);
      
	  List<InlineKeyboardButton> button89 = new ArrayList<>();
      button89.add(Iran);
      buttons1.add(button89);
      
	  List<InlineKeyboardButton> button90 = new ArrayList<>();
      button90.add(Iraq);
      buttons1.add(button90);
      
	  List<InlineKeyboardButton> button91 = new ArrayList<>();
      button91.add(Ireland);
      buttons1.add(button91);
      
	  List<InlineKeyboardButton> button92 = new ArrayList<>();
      button92.add(Israel);
      buttons1.add(button92);

	  List<InlineKeyboardButton> button93 = new ArrayList<>();
      button93.add(Italy);
      buttons1.add(button93);
      
	  List<InlineKeyboardButton> button94 = new ArrayList<>();
      button94.add(Ivory_Coast);
      buttons1.add(button94);
      
	  List<InlineKeyboardButton> button95 = new ArrayList<>();
      button95.add(Jamaica);
      buttons1.add(button95);
      
	  List<InlineKeyboardButton> button96 = new ArrayList<>();
      button96.add(Japan);
      buttons1.add(button96);
      
	  List<InlineKeyboardButton> button97 = new ArrayList<>();
      button97.add(Jordan);
      buttons1.add(button97);
      
	  List<InlineKeyboardButton> button98 = new ArrayList<>();
      button98.add(Kazakhstan);
      buttons1.add(button98);
      
	  List<InlineKeyboardButton> button99 = new ArrayList<>();
      button99.add(Kenya);
      buttons1.add(button99);
      
	  List<InlineKeyboardButton> button100 = new ArrayList<>();
      button100.add(Kiribati);
      buttons1.add(button100);
      
	  List<InlineKeyboardButton> button101 = new ArrayList<>();
      button101.add(North_Korea);
      buttons2.add(button101);
      
	  List<InlineKeyboardButton> button102 = new ArrayList<>();
      button102.add(South_Korea);
      buttons2.add(button102);
      
	  List<InlineKeyboardButton> button103 = new ArrayList<>();
      button103.add(Kuwait);
      buttons2.add(button103);
      
	  List<InlineKeyboardButton> button104 = new ArrayList<>();
      button104.add(Kyrgyzstan);
      buttons2.add(button104);
      
	  List<InlineKeyboardButton> button105 = new ArrayList<>();
      button105.add(Laos);
      buttons2.add(button105);
      
	  List<InlineKeyboardButton> button106 = new ArrayList<>();
      button106.add(Latvia);
      buttons2.add(button106);
      
	  List<InlineKeyboardButton> button107 = new ArrayList<>();
      button107.add(Lebanon);
      buttons2.add(button107);
      
	  List<InlineKeyboardButton> button108 = new ArrayList<>();
      button108.add(Lesotho);
      buttons2.add(button108);
      
	  List<InlineKeyboardButton> button109 = new ArrayList<>();
      button109.add(Liberia);
      buttons2.add(button109);
      
	  List<InlineKeyboardButton> button110 = new ArrayList<>();
      button110.add(Libya);
      buttons2.add(button110);
      
	  List<InlineKeyboardButton> button111 = new ArrayList<>();
      button111.add(Liechtenstein);
      buttons2.add(button111);
      
	  List<InlineKeyboardButton> button112 = new ArrayList<>();
      button112.add(Lithuania);
      buttons2.add(button112);
      
	  List<InlineKeyboardButton> button113 = new ArrayList<>();
      button113.add(Luxembourg);
      buttons2.add(button113);
      
	  List<InlineKeyboardButton> button114 = new ArrayList<>();
      button114.add(Macau);
      buttons2.add(button114);
      
	  List<InlineKeyboardButton> button115 = new ArrayList<>();
      button115.add(Madagascar);
      buttons2.add(button115);
      
	  List<InlineKeyboardButton> button116 = new ArrayList<>();
      button116.add(Malawi);
      buttons2.add(button116);
      
	  List<InlineKeyboardButton> button117 = new ArrayList<>();
      button117.add(Malaysia);
      buttons2.add(button117);
      
	  List<InlineKeyboardButton> button118 = new ArrayList<>();
      button118.add(Maldives);
      buttons2.add(button118);
      
	  List<InlineKeyboardButton> button119 = new ArrayList<>();
      button119.add(Mali);
      buttons2.add(button119);
      
	  List<InlineKeyboardButton> button120 = new ArrayList<>();
      button120.add(Malta);
      buttons2.add(button120);
      
	  List<InlineKeyboardButton> button121 = new ArrayList<>();
      button121.add(Marshall_Islands);
      buttons2.add(button121);

	  List<InlineKeyboardButton> button122 = new ArrayList<>();
      button122.add(Martinique);
      buttons2.add(button122);
      
	  List<InlineKeyboardButton> button123 = new ArrayList<>();
      button123.add(Mauritania);
      buttons2.add(button123);
      
	  List<InlineKeyboardButton> button124 = new ArrayList<>();
      button124.add(Mauritius);
      buttons2.add(button124);
      
	  List<InlineKeyboardButton> button125 = new ArrayList<>();
      button125.add(Mexico);
      buttons2.add(button125);
      
	  List<InlineKeyboardButton> button126 = new ArrayList<>();
      button126.add(Micronesia);
      buttons2.add(button126);
      
	  List<InlineKeyboardButton> button127 = new ArrayList<>();
      button127.add(Moldova);
      buttons2.add(button127);
      
	  List<InlineKeyboardButton> button128 = new ArrayList<>();
      button128.add(Monaco);
      buttons2.add(button128);
      
	  List<InlineKeyboardButton> button129 = new ArrayList<>();
      button129.add(Mongolia);
      buttons2.add(button129);
      
	  List<InlineKeyboardButton> button130 = new ArrayList<>();
      button130.add(Montenegro);
      buttons2.add(button130);
      
	  List<InlineKeyboardButton> button131 = new ArrayList<>();
      button131.add(Morocco);
      buttons2.add(button131);
      
	  List<InlineKeyboardButton> button132 = new ArrayList<>();
      button132.add(Mozambique);
      buttons2.add(button132);
      
	  List<InlineKeyboardButton> button133 = new ArrayList<>();
      button133.add(Myanmar);
      buttons2.add(button133);
      
	  List<InlineKeyboardButton> button134 = new ArrayList<>();
      button134.add(Namibia);
      buttons2.add(button134);
      
	  List<InlineKeyboardButton> button135 = new ArrayList<>();
      button135.add(Nauru);
      buttons2.add(button135);
      
	  List<InlineKeyboardButton> button136 = new ArrayList<>();
      button136.add(Nepal);
      buttons2.add(button136);
      
	  List<InlineKeyboardButton> button137 = new ArrayList<>();
      button137.add(Netherlands);
      buttons2.add(button137);
      
	  List<InlineKeyboardButton> button138 = new ArrayList<>();
      button138.add(New_Caledonia);
      buttons2.add(button138);
      
	  List<InlineKeyboardButton> button139 = new ArrayList<>();
      button139.add(New_Zealand);
      buttons2.add(button139);
      
	  List<InlineKeyboardButton> button140 = new ArrayList<>();
      button140.add(Nicaragua);
      buttons2.add(button140);
      
	  List<InlineKeyboardButton> button141 = new ArrayList<>();
      button141.add(Niger);
      buttons2.add(button141);
      
	  List<InlineKeyboardButton> button142 = new ArrayList<>();
      button142.add(Nigeria);
      buttons2.add(button142);
      
	  List<InlineKeyboardButton> button143 = new ArrayList<>();
      button143.add(Norfolk_Island);
      buttons2.add(button143);
      
	  List<InlineKeyboardButton> button144 = new ArrayList<>();
      button144.add(North_Macedonia);
      buttons2.add(button144);
      
	  List<InlineKeyboardButton> button145 = new ArrayList<>();
      button145.add(Norway);
      buttons2.add(button145);
      
	  List<InlineKeyboardButton> button146 = new ArrayList<>();
      button146.add(Oman);
      buttons2.add(button146);
      
	  List<InlineKeyboardButton> button147 = new ArrayList<>();
      button147.add(Pakistan);
      buttons2.add(button147);
      
	  List<InlineKeyboardButton> button148 = new ArrayList<>();
      button148.add(Palau);
      buttons2.add(button148);
      
	  List<InlineKeyboardButton> button149 = new ArrayList<>();
      button149.add(Palestine);
      buttons2.add(button149);
      
	  List<InlineKeyboardButton> button150 = new ArrayList<>();
      button150.add(Panama);
      buttons2.add(button150);
      
	  List<InlineKeyboardButton> button151 = new ArrayList<>();
      button151.add(Papua_New_Guinea);
      buttons2.add(button151);
      
	  List<InlineKeyboardButton> button152 = new ArrayList<>();
      button152.add(Paraguay);
      buttons2.add(button152);
      
	  List<InlineKeyboardButton> button153 = new ArrayList<>();
      button153.add(Peru);
      buttons2.add(button153);
      
	  List<InlineKeyboardButton> button154 = new ArrayList<>();
      button154.add(Philippines);
      buttons2.add(button154);
      
	  List<InlineKeyboardButton> button155 = new ArrayList<>();
      button155.add(Poland);
      buttons2.add(button155);
      
	  List<InlineKeyboardButton> button156 = new ArrayList<>();
      button156.add(Portugal);
      buttons2.add(button156);
      
	  List<InlineKeyboardButton> button157 = new ArrayList<>();
      button157.add(Qatar);
      buttons2.add(button157);
      
	  List<InlineKeyboardButton> button158 = new ArrayList<>();
      button158.add(Réunion);
      buttons2.add(button158);
      
	  List<InlineKeyboardButton> button159 = new ArrayList<>();
      button159.add(Romania);
      buttons2.add(button159);
      
	  List<InlineKeyboardButton> button160 = new ArrayList<>();
      button160.add(Russia);
      buttons2.add(button160);
      
	  List<InlineKeyboardButton> button161 = new ArrayList<>();
      button161.add(Rwanda);
      buttons2.add(button161);
      
	  List<InlineKeyboardButton> button162 = new ArrayList<>();
      button162.add(Saint_Kitts_and_Nevis);
      buttons2.add(button162);
      
	  List<InlineKeyboardButton> button163 = new ArrayList<>();
      button163.add(Saint_Lucia);
      buttons2.add(button163);
      
	  List<InlineKeyboardButton> button164 = new ArrayList<>();
      button164.add(Saint_Vincent_and_the_Grenadines);
      buttons2.add(button164);
      
	  List<InlineKeyboardButton> button165 = new ArrayList<>();
      button165.add(Samoa);
      buttons2.add(button165);
      
	  List<InlineKeyboardButton> button166 = new ArrayList<>();
      button166.add(San_Marino);
      buttons2.add(button166);
      
	  List<InlineKeyboardButton> button167 = new ArrayList<>();
      button167.add(São_Tomé_and_Príncipe);
      buttons2.add(button167);
      
	  List<InlineKeyboardButton> button168 = new ArrayList<>();
      button168.add(Saudi_Arabia);
      buttons2.add(button168);
      
	  List<InlineKeyboardButton> button169 = new ArrayList<>();
      button169.add(Senegal);
      buttons2.add(button169);
      
	  List<InlineKeyboardButton> button170 = new ArrayList<>();
      button170.add(Serbia);
      buttons2.add(button170);

	  List<InlineKeyboardButton> button171 = new ArrayList<>();
      button171.add(Seychelles);
      buttons2.add(button171);
      
	  List<InlineKeyboardButton> button172 = new ArrayList<>();
      button172.add(Sierra_Leone);
      buttons2.add(button172);
      
	  List<InlineKeyboardButton> button173 = new ArrayList<>();
      button173.add(Singapore);
      buttons2.add(button173);
      
	  List<InlineKeyboardButton> button174 = new ArrayList<>();
      button174.add(Slovakia);
      buttons2.add(button174);
      
	  List<InlineKeyboardButton> button175 = new ArrayList<>();
      button175.add(Slovenia);
      buttons2.add(button175);
      
	  List<InlineKeyboardButton> button176 = new ArrayList<>();
      button176.add(Solomon_Islands);
      buttons2.add(button176);
      
	  List<InlineKeyboardButton> button177 = new ArrayList<>();
      button177.add(Somalia);
      buttons2.add(button177);
      
	  List<InlineKeyboardButton> button178 = new ArrayList<>();
      button178.add(South_Africa);
      buttons2.add(button178);
      
	  List<InlineKeyboardButton> button179 = new ArrayList<>();
      button179.add(South_Sudan);
      buttons2.add(button179);
      
	  List<InlineKeyboardButton> button180 = new ArrayList<>();
      button180.add(Spain);
      buttons2.add(button180);
      
	  List<InlineKeyboardButton> button181 = new ArrayList<>();
      button181.add(Sri_Lanka);
      buttons2.add(button181);
      
	  List<InlineKeyboardButton> button182 = new ArrayList<>();
      button182.add(Sudan);
      buttons2.add(button182);
      
	  List<InlineKeyboardButton> button183 = new ArrayList<>();
      button183.add(Suriname);
      buttons2.add(button183);
      
	  List<InlineKeyboardButton> button184 = new ArrayList<>();
      button184.add(Sweden);
      buttons2.add(button184);
      
	  List<InlineKeyboardButton> button185 = new ArrayList<>();
      button185.add(Switzerland);
      buttons2.add(button185);
      
	  List<InlineKeyboardButton> button186 = new ArrayList<>();
      button186.add(Syria);
      buttons2.add(button186);
      
	  List<InlineKeyboardButton> button187 = new ArrayList<>();
      button187.add(Saint_Martin);
      buttons2.add(button187);
      
	  List<InlineKeyboardButton> button188 = new ArrayList<>();
      button188.add(Sint_Maarten);
      buttons2.add(button188);
      
	  List<InlineKeyboardButton> button189 = new ArrayList<>();
      button189.add(Tajikistan);
      buttons2.add(button189);
      
	  List<InlineKeyboardButton> button190 = new ArrayList<>();
      button190.add(Tanzania);
      buttons2.add(button190);
      
	  List<InlineKeyboardButton> button191 = new ArrayList<>();
      button191.add(Thailand);
      buttons2.add(button191);
      
	  List<InlineKeyboardButton> button192 = new ArrayList<>();
      button192.add(Togo);
      buttons2.add(button192);
      
	  List<InlineKeyboardButton> button193 = new ArrayList<>();
      button193.add(Tonga);
      buttons2.add(button193);
      
	  List<InlineKeyboardButton> button194 = new ArrayList<>();
      button194.add(Trinidad_and_Tobago);
      buttons2.add(button194);
      
	  List<InlineKeyboardButton> button195 = new ArrayList<>();
      button195.add(Tunisia);
      buttons2.add(button195);
      
	  List<InlineKeyboardButton> button196 = new ArrayList<>();
      button196.add(Turkey);
      buttons2.add(button196);
      
	  List<InlineKeyboardButton> button197 = new ArrayList<>();
      button197.add(Turkmenistan);
      buttons2.add(button197);
      
	  List<InlineKeyboardButton> button198 = new ArrayList<>();
      button198.add(Tuvalu);
      buttons2.add(button198);
      
	  List<InlineKeyboardButton> button199 = new ArrayList<>();
      button199.add(Uganda);
      buttons2.add(button199);
      
	  List<InlineKeyboardButton> button200 = new ArrayList<>();
      button200.add(Ukraine);
      buttons2.add(button200);
      
	  List<InlineKeyboardButton> button201 = new ArrayList<>();
      button201.add(United_Arab_Emirates);
      buttons3.add(button201);
      
	  List<InlineKeyboardButton> button202 = new ArrayList<>();
      button202.add(United_Kingdom);
      buttons3.add(button202);
      
	  List<InlineKeyboardButton> button203 = new ArrayList<>();
      button203.add(Uruguay);
      buttons3.add(button203);
      
	  List<InlineKeyboardButton> button204 = new ArrayList<>();
      button204.add(Uzbekistan);
      buttons3.add(button204);
      
	  List<InlineKeyboardButton> button205 = new ArrayList<>();
      button205.add(Vanuatu);
      buttons3.add(button205);
      
	  List<InlineKeyboardButton> button206 = new ArrayList<>();
      button206.add(Vatican_City);
      buttons3.add(button206);
      
	  List<InlineKeyboardButton> button207 = new ArrayList<>();
      button207.add(Venezuela);
      buttons3.add(button207);
      
	  List<InlineKeyboardButton> button208 = new ArrayList<>();
      button208.add(Vietnam);
      buttons3.add(button208);
      
	  List<InlineKeyboardButton> button209 = new ArrayList<>();
      button209.add(Vanuatu);
      buttons3.add(button209);
      
	  List<InlineKeyboardButton> button210 = new ArrayList<>();
      button210.add(Wales);
      buttons3.add(button210);
      
	  List<InlineKeyboardButton> button211 = new ArrayList<>();
      button211.add(Wallis_and_Futuna);
      buttons3.add(button211);
      
	  List<InlineKeyboardButton> button212 = new ArrayList<>();
      button212.add(Western_Sahara);
      buttons3.add(button212);
      
	  List<InlineKeyboardButton> button213 = new ArrayList<>();
      button213.add(Yemen);
      buttons3.add(button213);
      
	  List<InlineKeyboardButton> button214 = new ArrayList<>();
      button214.add(Zambia);
      buttons3.add(button214);
      
	  List<InlineKeyboardButton> button215 = new ArrayList<>();
      button215.add(Zimbabwe);
      buttons3.add(button215);
      
      
      
      InlineKeyboardMarkup markupKeyboard1 = new InlineKeyboardMarkup();
      markupKeyboard1.setKeyboard(buttons1);
      InlineKeyboardMarkup markupKeyboard2 = new InlineKeyboardMarkup();
      markupKeyboard2.setKeyboard(buttons2);
      InlineKeyboardMarkup markupKeyboard3 = new InlineKeyboardMarkup();
      markupKeyboard3.setKeyboard(buttons3);
	  
      
      
      // We check if the update has a message and the message has text
      if (update.hasMessage() && update.getMessage().hasText()) {
          long chat_id = update.getMessage().getChatId();
          if (update.getMessage().getText().equals("/start")) {
        	  sendMenu(chat_id, "<b>This is the starting menu, choose your country</b>", markupKeyboard1);
        	  sendMenu(chat_id, "<b>Continued List</b>", markupKeyboard2);
        	  sendMenu(chat_id,"<b>Continued List</b>", markupKeyboard3);
          } 
      	} 
      if (update.hasCallbackQuery()) {
          // Set variables
          String call_data = update.getCallbackQuery().getData();
          long chat_id = update.getCallbackQuery().getMessage().getChatId();
          System.out.println(call_data);
          
          if (call_data.equals("Afghanistan")) {
        	  String Afghanistanmsg = "";
        	  sendText(chat_id, Afghanistanmsg);
          							}
          
          if (call_data.equals("Åland")) {
        	  String Ålandmsg = "";
        	  sendText(chat_id, Ålandmsg);
          							}
          
          if (call_data.equals("Albania")) {
        	  InlineKeyboardButton Albania_info_safety = InlineKeyboardButton.builder()
        	          .text("Safety \uD83D\uDC6E").callbackData("Albania_info_safety")           
        	          .build();
        	  InlineKeyboardButton Albania_info_healthcare = InlineKeyboardButton.builder()
        	          .text("Healthcare \u2695\uFE0F").callbackData("Albania_info_healthcare")           
        	          .build();
        	  InlineKeyboardButton Albania_info_costofliving = InlineKeyboardButton.builder()
        	          .text("Cost of Living \uD83D\uDCB0").callbackData("Albania_info_costofliving")           
        	          .build();
        	  InlineKeyboardButton Albania_info_accomodations = InlineKeyboardButton.builder()
        	          .text("Accomodations \uD83C\uDFD8\uFE0F").callbackData("Albania_info_accomodations")           
        	          .build();
        	  InlineKeyboardButton Albania_info_transportation = InlineKeyboardButton.builder()
        	          .text("Transportation \uD83D\uDE95").callbackData("Albania_info_transportation")           
        	          .build();
        	  InlineKeyboardButton Albania_info_attractions = InlineKeyboardButton.builder()
        	          .text("Attractions \uD83C\uDFA1").callbackData("Albania_info_attractions")           
        	          .build();
        	  InlineKeyboardButton Albania_info_climate = InlineKeyboardButton.builder()
        	          .text("Climate \uD83C\uDF24\uFE0F").callbackData("Albania_info_climate")           
        	          .build();
        	  InlineKeyboardButton Albania_info_language = InlineKeyboardButton.builder()
        	          .text("Language \uD83D\uDCAC").callbackData("Albania_info_language")           
        	          .build();
        	  InlineKeyboardButton Albania_info_cultural_etiquettes = InlineKeyboardButton.builder()
        	          .text("Cultural Etiquettes \u26E9\uFE0F").callbackData("Albania_info_cultural_etiquettes")           
        	          .build();
        	  InlineKeyboardButton Albania_info_cuisines = InlineKeyboardButton.builder()
        	          .text("Cuisines \uD83C\uDF5C").callbackData("Albania_info_cuisines")           
        	          .build();
        	  InlineKeyboardButton Albania_info_internet_availability = InlineKeyboardButton.builder()
        	          .text("Internet Availability \uD83D\uDEDC").callbackData("Albania_info_internet_availability")           
        	          .build();
        	  InlineKeyboardButton Albania_info_traditions_and_crafts = InlineKeyboardButton.builder()
        	          .text("Traditions and Crafts \uD83E\uDE86").callbackData("Albania_info_traditions_and_crafts")           
        	          .build();
        	  InlineKeyboardButton Albania_info_geography = InlineKeyboardButton.builder()
        	          .text("Geography \uD83D\uDDFA\uFE0F").callbackData("Albania_info_geography")           
        	          .build();
        	  
        	  
        	  List<List<InlineKeyboardButton>> Albania_buttons = new ArrayList<>();
        	  List<InlineKeyboardButton> Albania_info_safety_button = new ArrayList<>();
        	  List<InlineKeyboardButton> Albania_info_healthcare_button = new ArrayList<>();
        	  List<InlineKeyboardButton> Albania_info_costofliving_button = new ArrayList<>();
        	  List<InlineKeyboardButton> Albania_info_accomodations_button = new ArrayList<>();
        	  List<InlineKeyboardButton> Albania_info_transportation_button = new ArrayList<>();
        	  List<InlineKeyboardButton> Albania_info_attractions_button = new ArrayList<>();
        	  List<InlineKeyboardButton> Albania_info_climate_button = new ArrayList<>();
        	  List<InlineKeyboardButton> Albania_info_language_button = new ArrayList<>();
        	  List<InlineKeyboardButton> Albania_info_cultural_etiquettes_button = new ArrayList<>();
        	  List<InlineKeyboardButton> Albania_info_cuisines_button = new ArrayList<>();
        	  List<InlineKeyboardButton> Albania_info_internet_availability_button = new ArrayList<>();
        	  List<InlineKeyboardButton> Albania_info_traditions_and_crafts_button = new ArrayList<>();
        	  List<InlineKeyboardButton> Albania_info_geography_button = new ArrayList<>();

        	  
              Albania_info_safety_button.add(Albania_info_safety);
              Albania_info_healthcare_button.add(Albania_info_healthcare);
              Albania_info_costofliving_button.add(Albania_info_costofliving);
              Albania_info_accomodations_button.add(Albania_info_accomodations);
              Albania_info_transportation_button.add(Albania_info_transportation);
              Albania_info_attractions_button.add(Albania_info_attractions);
              Albania_info_climate_button.add(Albania_info_climate);
              Albania_info_language_button.add(Albania_info_language);
              Albania_info_cultural_etiquettes_button.add(Albania_info_cultural_etiquettes);
              Albania_info_cuisines_button.add(Albania_info_cuisines);
              Albania_info_internet_availability_button.add(Albania_info_internet_availability);
              Albania_info_traditions_and_crafts_button.add(Albania_info_traditions_and_crafts);
              Albania_info_geography_button.add(Albania_info_geography);

              
              
              Albania_buttons.add(Albania_info_safety_button);
              Albania_buttons.add(Albania_info_healthcare_button);
              Albania_buttons.add(Albania_info_costofliving_button);
              Albania_buttons.add(Albania_info_accomodations_button);
              Albania_buttons.add(Albania_info_transportation_button);
              Albania_buttons.add(Albania_info_attractions_button);
              Albania_buttons.add(Albania_info_climate_button);
              Albania_buttons.add(Albania_info_language_button);
              Albania_buttons.add(Albania_info_cultural_etiquettes_button);
              Albania_buttons.add(Albania_info_cuisines_button);
              Albania_buttons.add(Albania_info_internet_availability_button);
              Albania_buttons.add(Albania_info_traditions_and_crafts_button);
              Albania_buttons.add(Albania_info_geography_button);

              
              
              
              InlineKeyboardMarkup Albania_buttons_menu = new InlineKeyboardMarkup();
              Albania_buttons_menu.setKeyboard(Albania_buttons);
              sendMenu(chat_id, "Americans can stay in Albania visa-free for up to a year. Here is some information about the country:", Albania_buttons_menu);
          							}
          
          if (call_data.equals("Algeria")) {
        	  String Algeriamsg = "";
        	  sendText(chat_id, Algeriamsg);
          							}
          
          if (call_data.equals("American_Samoa")) {
        	  String American_Samoamsg = "";
        	  sendText(chat_id, American_Samoamsg);
          							}
          
          if (call_data.equals("Andorra")) {
        	  String Andorramsg = "";
        	  sendText(chat_id, Andorramsg);
          							}
          
          if (call_data.equals("Angola")) {
        	  String Angolamsg = "";
        	  sendText(chat_id, Angolamsg);
          							}
          
          if (call_data.equals("Anguilla")) {
        	  String Anguillamsg = "";
        	  sendText(chat_id, Anguillamsg);
          							}
          
          if (call_data.equals("Antigua_and_Barbuda")) {
        	  String Antigua_and_Barbudamsg = "";
        	  sendText(chat_id, Antigua_and_Barbudamsg);
          							}
          
          if (call_data.equals("Argentina")) {
        	  String Argentinamsg = "";
        	  sendText(chat_id, Argentinamsg);
          							}
          
          if (call_data.equals("Argentina")) {
        	  String Argentinamsg = "";
        	  sendText(chat_id, Argentinamsg);
          							}
          
          if (call_data.equals("Aruba")) {
        	  String Arubamsg = "";
        	  sendText(chat_id, Arubamsg);
          							}
          
          if (call_data.equals("Australia")) {
        	  String Australiamsg = "";
        	  sendText(chat_id, Australiamsg);
          							}
          
          if (call_data.equals("Austria")) {
        	  String Austriamsg = "";
        	  sendText(chat_id, Austriamsg);
          							}
          
          if (call_data.equals("Azerbaijan")) {
        	  String Azerbaijanmsg = "";
        	  sendText(chat_id, Azerbaijanmsg);
          							}
          
          if (call_data.equals("Bahamas")) {
        	  String Bahamasmsg = "";
        	  sendText(chat_id, Bahamasmsg);
          							}
          
          if (call_data.equals("Bahrain")) {
        	  String Bahrainmsg = "";
        	  sendText(chat_id, Bahrainmsg);
          							}
          
          if (call_data.equals("Bangladesh")) {
        	  String Bangladeshmsg = "";
        	  sendText(chat_id, Bangladeshmsg);
          							}
          
          if (call_data.equals("Barbados")) {
        	  String Barbadosmsg = "";
        	  sendText(chat_id, Barbadosmsg);
          							}
          
          if (call_data.equals("Belarus")) {
        	  String Belarusmsg = "";
        	  sendText(chat_id, Belarusmsg);
          							}
          
          if (call_data.equals("Belgium")) {
        	  String Belgiummsg = "";
        	  sendText(chat_id, Belgiummsg);
          							}
          
          if (call_data.equals("Belize")) {
        	  String Belizemsg = "";
        	  sendText(chat_id, Belizemsg);
          							}
          
          if (call_data.equals("Benin")) {
        	  String Beninmsg = "";
        	  sendText(chat_id, Beninmsg);
          							}
          
          if (call_data.equals("Bermuda")) {
        	  String Bermudamsg = "";
        	  sendText(chat_id, Bermudamsg);
          							}
          
          if (call_data.equals("Bhutan")) {
        	  String Bhutanmsg = "";
        	  sendText(chat_id, Bhutanmsg);
          							}
          
          if (call_data.equals("Bolivia")) {
        	  String Boliviamsg = "";
        	  sendText(chat_id, Boliviamsg);
          							}
          
          if (call_data.equals("Bonaire")) {
        	  String Bonairemsg = "";
        	  sendText(chat_id, Bonairemsg);
          							}
          
          if (call_data.equals("Bosnia_and_Herzegovina")) {
        	  String Bosnia_and_Herzegovinamsg = "";
        	  sendText(chat_id, Bosnia_and_Herzegovinamsg);
          							}
          
          if (call_data.equals("Botswana")) {
        	  String Botswanamsg = "";
        	  sendText(chat_id, Botswanamsg);
          							}
          
          if (call_data.equals("Brazil")) {
        	  String Brazilmsg = "";
        	  sendText(chat_id, Brazilmsg);
          							}
          
          if (call_data.equals("British_Indian_Ocean_Territory")) {
        	  String British_Indian_Ocean_Territorymsg = "";
        	  sendText(chat_id, British_Indian_Ocean_Territorymsg);
          							}
          
          if (call_data.equals("British_Virgin_Islands")) {
        	  String British_Virgin_Islandsmsg = "";
        	  sendText(chat_id, British_Virgin_Islandsmsg);
          							}
          
          if (call_data.equals("Brunei")) {
        	  String Bruneimsg = "";
        	  sendText(chat_id, Bruneimsg);
          							}
          
          if (call_data.equals("Bulgaria")) {
        	  String Bulgariamsg = "";
        	  sendText(chat_id, Bulgariamsg);
          							}
          
          if (call_data.equals("Burkina_Faso")) {
        	  String Burkina_Fasomsg = "";
        	  sendText(chat_id, Burkina_Fasomsg);
          							}
          
          if (call_data.equals("Burundi")) {
        	  String Burundimsg = "";
        	  sendText(chat_id, Burundimsg);
          							}
          
          if (call_data.equals("Cambodia")) {
        	  String Cambodiamsg = "";
        	  sendText(chat_id, Cambodiamsg);
          							}
          
          if (call_data.equals("Cameroon")) {
        	  String Cameroonmsg = "";
        	  sendText(chat_id, Cameroonmsg);
          							}
          
          if (call_data.equals("Canada")) {
        	  String Canadamsg = "";
        	  sendText(chat_id, Canadamsg);
          							}
          
          if (call_data.equals("Cape_Verde")) {
        	  String Cape_Verdemsg = "";
        	  sendText(chat_id, Cape_Verdemsg);
          							}
          
          if (call_data.equals("Central_African_Republic")) {
        	  String Central_African_Republicmsg = "";
        	  sendText(chat_id, Central_African_Republicmsg);
          							}
          
          if (call_data.equals("Chad")) {
        	  String Chadmsg = "";
        	  sendText(chat_id, Chadmsg);
          							}
          
          if (call_data.equals("Chile")) {
        	  String Chilemsg = "";
        	  sendText(chat_id, Chilemsg);
          							}
          
          if (call_data.equals("China")) {
        	  String Chinamsg = "";
        	  sendText(chat_id, Chinamsg);
          							}
          
          if (call_data.equals("Colombia")) {
        	  String Colombiamsg = "";
        	  sendText(chat_id, Colombiamsg);
          							}
          
          if (call_data.equals("Comoros")) {
        	  String Comorosmsg = "";
        	  sendText(chat_id, Comorosmsg);
          							}
          
          if (call_data.equals("Democratic_Republic_of_the_Congo")) {
        	  String Democratic_Republic_of_the_Congomsg = "";
        	  sendText(chat_id, Democratic_Republic_of_the_Congomsg);
          							}
          
          if (call_data.equals("Republic_of_the_Congo")) {
        	  String Republic_of_the_Congomsg = "";
        	  sendText(chat_id, Republic_of_the_Congomsg);
          							}
          
          if (call_data.equals("Costa_Rica")) {
        	  String Costa_Ricamsg = "";
        	  sendText(chat_id, Costa_Ricamsg);
          							}
          
          
          if (call_data.equals("Croatia")) {
        	  String Croatiamsg = "";
        	  sendText(chat_id, Croatiamsg);
          							}
          
          if (call_data.equals("Cuba")) {
        	  String Cubamsg = "";
        	  sendText(chat_id, Cubamsg);
          							}
          
          if (call_data.equals("Curaçao")) {
        	  String Curaçaomsg = "";
        	  sendText(chat_id, Curaçaomsg);
          							}
          
          if (call_data.equals("Cyprus")) {
        	  String Cyprusmsg = "";
        	  sendText(chat_id, Cyprusmsg);
          							}
          
          if (call_data.equals("Czech_Republic")) {
        	  String Czech_Republicmsg = "";
        	  sendText(chat_id, Czech_Republicmsg);
          							}
          
          if (call_data.equals("Denmark")) {
        	  String Denmarkmsg = "";
        	  sendText(chat_id, Denmarkmsg);
          							}
          
          if (call_data.equals("Djibouti")) {
        	  String Djiboutimsg = "";
        	  sendText(chat_id, Djiboutimsg);
          							}
          
          if (call_data.equals("Dominica")) {
        	  String Dominicamsg = "";
        	  sendText(chat_id, Dominicamsg);
          							}
          
          if (call_data.equals("Dominican_Republic")) {
        	  String Dominican_Republicmsg = "";
        	  sendText(chat_id, Dominican_Republicmsg);
          							}
          
          if (call_data.equals("East_Timor")) {
        	  String East_Timormsg = "";
        	  sendText(chat_id, East_Timormsg);
          							}
          
          if (call_data.equals("Ecuador")) {
        	  String Ecuadormsg = "";
        	  sendText(chat_id, Ecuadormsg);
          							}
          
          if (call_data.equals("Egypt")) {
        	  String Egyptmsg = "";
        	  sendText(chat_id, Egyptmsg);
          							}
          
          if (call_data.equals("El_Salvador")) {
        	  String El_Salvadormsg = "";
        	  sendText(chat_id, El_Salvadormsg);
          							}
          
          if (call_data.equals("Equatorial_Guinea")) {
        	  String Equatorial_Guineamsg = "";
        	  sendText(chat_id, Equatorial_Guineamsg);
          							}
          
          if (call_data.equals("Eritrea")) {
        	  String Eritreamsg = "";
        	  sendText(chat_id, Eritreamsg);
          							}
          
          if (call_data.equals("Estonia")) {
        	  String Estoniamsg = "";
        	  sendText(chat_id, Estoniamsg);
          							}
          
          if (call_data.equals("Eswatini")) {
        	  String Eswatinimsg = "";
        	  sendText(chat_id, Eswatinimsg);
          							}
          
          if (call_data.equals("Ethiopia")) {
        	  String Ethiopiamsg = "";
        	  sendText(chat_id, Ethiopiamsg);
          							}
          
          if (call_data.equals("Fiji")) {
        	  String Fijimsg = "";
        	  sendText(chat_id, Fijimsg);
          							}
          
          if (call_data.equals("Finland")) {
        	  String Finlandmsg = "";
        	  sendText(chat_id, Finlandmsg);
          							}
          
          if (call_data.equals("France")) {
        	  String Francemsg = "";
        	  sendText(chat_id, Francemsg);
          							}
          
          if (call_data.equals("Gabon")) {
        	  String Gabonmsg = "";
        	  sendText(chat_id, Gabonmsg);
          							}
          
          if (call_data.equals("Gambia")) {
        	  String Gambiamsg = "";
        	  sendText(chat_id, Gambiamsg);
          							}
          
          if (call_data.equals("Georgia")) {
        	  String Georgiamsg = "";
        	  sendText(chat_id, Georgiamsg);
          							}
          
          if (call_data.equals("Germany")) {
        	  String Germanymsg = "";
        	  sendText(chat_id, Germanymsg);
          							}
          
          if (call_data.equals("Ghana")) {
        	  String Ghanamsg = "";
        	  sendText(chat_id, Ghanamsg);
          							}
          
          if (call_data.equals("Greece")) {
        	  String Greecemsg = "";
        	  sendText(chat_id, Greecemsg);
          							}
          
          if (call_data.equals("Grenada")) {
        	  String Grenadamsg = "";
        	  sendText(chat_id, Grenadamsg);
          							}
          
          if (call_data.equals("Guatemala")) {
        	  String Guatemalamsg = "";
        	  sendText(chat_id, Guatemalamsg);
          							}
          
          if (call_data.equals("Guinea")) {
        	  String Guineamsg = "";
        	  sendText(chat_id, Guineamsg);
          							}
          
          if (call_data.equals("Guinea_Bissau")) {
        	  String Guinea_Bissaumsg = "";
        	  sendText(chat_id, Guinea_Bissaumsg);
          							}
          
          if (call_data.equals("Guyana")) {
        	  String Guyanamsg = "";
        	  sendText(chat_id, Guyanamsg);
          							}
          
          if (call_data.equals("Haiti")) {
        	  String Haitimsg = "";
        	  sendText(chat_id, Haitimsg);
          							}
          
          if (call_data.equals("Honduras")) {
        	  String Hondurasmsg = "";
        	  sendText(chat_id, Hondurasmsg);
          							}
          
          if (call_data.equals("Hong_Kong")) {
        	  String Hong_Kongmsg = "";
        	  sendText(chat_id, Hong_Kongmsg);
          							}
          
          if (call_data.equals("Hungary")) {
        	  String Hungarymsg = "";
        	  sendText(chat_id, Hungarymsg);
          							}
          
          if (call_data.equals("Iceland")) {
        	  String Icelandmsg = "";
        	  sendText(chat_id, Icelandmsg);
          							}
          
          if (call_data.equals("India")) {
        	  String Indiamsg = "";
        	  sendText(chat_id, Indiamsg);
          							}
          
          if (call_data.equals("Indonesia")) {
        	  String Indonesiamsg = "";
        	  sendText(chat_id, Indonesiamsg);
          							}
          
          if (call_data.equals("Iran")) {
        	  String Iranmsg = "";
        	  sendText(chat_id, Iranmsg);
          							}
          
          if (call_data.equals("Iraq")) {
        	  String Iraqmsg = "";
        	  sendText(chat_id, Iraqmsg);
          							}
          
          if (call_data.equals("Ireland")) {
        	  String Irelandmsg = "";
        	  sendText(chat_id, Irelandmsg);
          							}
          
          if (call_data.equals("Israel")) {
        	  String Israelmsg = "";
        	  sendText(chat_id, Israelmsg);
          							}
          
          if (call_data.equals("Italy")) {
        	  String Italymsg = "";
        	  sendText(chat_id, Italymsg);
          							}
          
          if (call_data.equals("Ivory_Coast")) {
        	  String Ivory_Coastmsg = "";
        	  sendText(chat_id, Ivory_Coastmsg);
          							}
          
          if (call_data.equals("Jamaica")) {
        	  String Jamaicamsg = "";
        	  sendText(chat_id, Jamaicamsg);
          							}
          
          if (call_data.equals("Japan")) {
        	  String Japanmsg = "";
        	  sendText(chat_id, Japanmsg);
          							}
          
          if (call_data.equals("Jordan")) {
        	  String Jordanmsg = "";
        	  sendText(chat_id, Jordanmsg);
          							}
          
          if (call_data.equals("Kazakhstan")) {
        	  String Kazakhstanmsg = "";
        	  sendText(chat_id, Kazakhstanmsg);
          							}
          
          if (call_data.equals("Kenya")) {
        	  String Kenyamsg = "";
        	  sendText(chat_id, Kenyamsg);
          							}
          
          if (call_data.equals("Kiribati")) {
        	  String Kiribatimsg = "";
        	  sendText(chat_id, Kiribatimsg);
          							}
          
          if (call_data.equals("North_Korea")) {
        	  String North_Koreamsg = "";
        	  sendText(chat_id, North_Koreamsg);
          							}
          
          if (call_data.equals("South_Korea")) {
        	  String South_Koreamsg = "";
        	  sendText(chat_id, South_Koreamsg);
          							}
          
          if (call_data.equals("Kuwait")) {
        	  String Kuwaitmsg = "";
        	  sendText(chat_id, Kuwaitmsg);
          							}
          
          if (call_data.equals("Kyrgyzstan")) {
        	  String Kyrgyzstanmsg = "";
        	  sendText(chat_id, Kyrgyzstanmsg);
          							}
          
          if (call_data.equals("Laos")) {
        	  String Laosmsg = "";
        	  sendText(chat_id, Laosmsg);
          							}
          
          if (call_data.equals("Latvia")) {
        	  String Latviamsg = "";
        	  sendText(chat_id, Latviamsg);
          							}
          
          if (call_data.equals("Lebanon")) {
        	  String Lebanonmsg = "";
        	  sendText(chat_id, Lebanonmsg);
          							}
          
          if (call_data.equals("Lesotho")) {
        	  String Lesothomsg = "";
        	  sendText(chat_id, Lesothomsg);
          							}
          
          if (call_data.equals("Liberia")) {
        	  String Liberiamsg = "";
        	  sendText(chat_id, Liberiamsg);
          							}
          
          if (call_data.equals("Libya")) {
        	  String Libyamsg = "";
        	  sendText(chat_id, Libyamsg);
          							}
          
          if (call_data.equals("Liechtenstein")) {
        	  String Liechtensteinmsg = "";
        	  sendText(chat_id, Liechtensteinmsg);
          							}
          
          if (call_data.equals("Lithuania")) {
        	  String Lithuaniamsg = "";
        	  sendText(chat_id, Lithuaniamsg);
          							}
          
          if (call_data.equals("Luxembourg")) {
        	  String Luxembourgmsg = "";
        	  sendText(chat_id, Luxembourgmsg);
          							}
          
          if (call_data.equals("Macau")) {
        	  String Macaumsg = "";
        	  sendText(chat_id, Macaumsg);
          							}
          
          if (call_data.equals("Madagascar")) {
        	  String Madagascarmsg = "";
        	  sendText(chat_id, Madagascarmsg);
          							}
          
          if (call_data.equals("Malawi")) {
        	  String Malawimsg = "";
        	  sendText(chat_id, Malawimsg);
          							}
          
          if (call_data.equals("Malaysia")) {
        	  String Malaysiamsg = "";
        	  sendText(chat_id, Malaysiamsg);
          							}
          
          if (call_data.equals("Maldives")) {
        	  String Maldivesmsg = "";
        	  sendText(chat_id, Maldivesmsg);
          							}
          
          if (call_data.equals("Mali")) {
        	  String Malimsg = "";
        	  sendText(chat_id, Malimsg);
          							}
          
          if (call_data.equals("Malta")) {
        	  String Maltamsg = "";
        	  sendText(chat_id, Maltamsg);
          							}
          
          if (call_data.equals("Marshall_Islands")) {
        	  String Marshall_Islandsmsg = "";
        	  sendText(chat_id, Marshall_Islandsmsg);
          							}
          
          if (call_data.equals("Martinique")) {
        	  String Martiniquemsg = "";
        	  sendText(chat_id, Martiniquemsg);
          							}
          
          if (call_data.equals("Mauritania")) {
        	  String Mauritaniamsg = "";
        	  sendText(chat_id, Mauritaniamsg);
          							}
          if (call_data.equals("Mauritius")) {
        	  String Mauritiusmsg = "";
        	  sendText(chat_id, Mauritiusmsg);
          							}
          if (call_data.equals("Mexico")) {
        	  String Mexicomsg = "";
        	  sendText(chat_id, Mexicomsg);
          							}
          
          if (call_data.equals("Micronesia")) {
        	  String Micronesiamsg = "";
        	  sendText(chat_id, Micronesiamsg);
          							}
          
          if (call_data.equals("Moldova")) {
        	  String Moldovamsg = "";
        	  sendText(chat_id, Moldovamsg);
          							}
          
          if (call_data.equals("Monaco")) {
        	  String Monacomsg = "";
        	  sendText(chat_id, Monacomsg);
          							}
          
          if (call_data.equals("Mongolia")) {
        	  String Mongoliamsg = "";
        	  sendText(chat_id, Mongoliamsg);
          							}
          
          if (call_data.equals("Montenegro")) {
        	  String Montenegromsg = "";
        	  sendText(chat_id, Montenegromsg);
          							}
          
          if (call_data.equals("Morocco")) {
        	  String Moroccomsg = "";
        	  sendText(chat_id, Moroccomsg);
          							}
          
          if (call_data.equals("Mozambique")) {
        	  String Mozambiquemsg = "";
        	  sendText(chat_id, Mozambiquemsg);
          							}
          
          if (call_data.equals("Myanmar")) {
        	  String Myanmarmsg = "";
        	  sendText(chat_id, Myanmarmsg);
          							}
          
          if (call_data.equals("Namibia")) {
        	  String Namibiamsg = "";
        	  sendText(chat_id, Namibiamsg);
          							}
          
          if (call_data.equals("Nauru")) {
        	  String Naurumsg = "";
        	  sendText(chat_id, Naurumsg);
          							}
          
          if (call_data.equals("Nepal")) {
        	  String Nepalmsg = "";
        	  sendText(chat_id, Nepalmsg);
          							}
          
          if (call_data.equals("Netherlands")) {
        	  String Netherlandsmsg = "";
        	  sendText(chat_id, Netherlandsmsg);
          							}
          
          if (call_data.equals("New_Caledonia")) {
        	  String New_Caledoniamsg = "";
        	  sendText(chat_id, New_Caledoniamsg);
          							}
          
          if (call_data.equals("New_Zealand")) {
        	  String New_Zealandmsg = "";
        	  sendText(chat_id, New_Zealandmsg);
          							}
          
          if (call_data.equals("Nicaragua")) {
        	  String Nicaraguamsg = "";
        	  sendText(chat_id, Nicaraguamsg);
          							}
          
          if (call_data.equals("Niger")) {
        	  String Nigermsg = "";
        	  sendText(chat_id, Nigermsg);
          							}
          
          if (call_data.equals("Nigeria")) {
        	  String Nigeriamsg = "";
        	  sendText(chat_id, Nigeriamsg);
          							}
          
          if (call_data.equals("Norfolk_Island")) {
        	  String Norfolk_Islandmsg = "";
        	  sendText(chat_id, Norfolk_Islandmsg);
          							}
          
          if (call_data.equals("North_Macedonia")) {
        	  String North_Macedoniamsg = "";
        	  sendText(chat_id, North_Macedoniamsg);
          							}
          
          if (call_data.equals("Norway")) {
        	  String Norwaymsg = "";
        	  sendText(chat_id, Norwaymsg);
          							}
          
          if (call_data.equals("Oman")) {
        	  String Omanmsg = "";
        	  sendText(chat_id, Omanmsg);
          							}
          
          if (call_data.equals("Pakistan")) {
        	  String Pakistanmsg = "";
        	  sendText(chat_id, Pakistanmsg);
          							}
          
          if (call_data.equals("Palau")) {
        	  String Palaumsg = "";
        	  sendText(chat_id, Palaumsg);
          							}
          
          if (call_data.equals("Palestine")) {
        	  String Palestinemsg = "";
        	  sendText(chat_id, Palestinemsg);
          							}
          
          if (call_data.equals("Panama")) {
        	  String Panamamsg = "";
        	  sendText(chat_id, Panamamsg);
          							}
          
          if (call_data.equals("Papua_New_Guinea")) {
        	  String Papua_New_Guineamsg = "";
        	  sendText(chat_id, Papua_New_Guineamsg);
          							}
          
          if (call_data.equals("Paraguay")) {
        	  String Paraguaymsg = "";
        	  sendText(chat_id, Paraguaymsg);
          							}
          
          if (call_data.equals("Peru")) {
        	  String Perumsg = "";
        	  sendText(chat_id, Perumsg);
          							}
          
          if (call_data.equals("Philippines")) {
        	  String Philippinesmsg = "";
        	  sendText(chat_id, Philippinesmsg);
          							}
          
          if (call_data.equals("Poland")) {
        	  String Polandmsg = "";
        	  sendText(chat_id, Polandmsg);
          							}
          
          if (call_data.equals("Qatar")) {
        	  String Qatarmsg = "";
        	  sendText(chat_id, Qatarmsg);
          							}
          
          if (call_data.equals("Réunion")) {
        	  String Réunionmsg = "";
        	  sendText(chat_id, Réunionmsg);
          							}
          
          if (call_data.equals("Romania")) {
        	  String Romaniamsg = "";
        	  sendText(chat_id, Romaniamsg);
          							}
          
          if (call_data.equals("Russia")) {
        	  String Russiamsg = "";
        	  sendText(chat_id, Russiamsg);
          							}
          
          if (call_data.equals("Rwanda")) {
        	  String Rwandamsg = "";
        	  sendText(chat_id, Rwandamsg);
          							}
          
          if (call_data.equals("Saint_Kitts_and_Nevis")) {
        	  String Saint_Kitts_and_Nevismsg = "";
        	  sendText(chat_id, Saint_Kitts_and_Nevismsg);
          							}
          
          if (call_data.equals("Saint_Lucia")) {
        	  String Saint_Luciamsg = "";
        	  sendText(chat_id, Saint_Luciamsg);
          							}
          
          if (call_data.equals("Saint_Vincent_and_the_Grenadines")) {
        	  String Saint_Vincent_and_the_Grenadinesmsg = "";
        	  sendText(chat_id, Saint_Vincent_and_the_Grenadinesmsg);
          							}
          
          if (call_data.equals("Samoa")) {
        	  String Samoamsg = "";
        	  sendText(chat_id, Samoamsg);
          							}
          
          if (call_data.equals("San_Marino")) {
        	  String San_Marinomsg = "";
        	  sendText(chat_id, San_Marinomsg);
          							}
          
          if (call_data.equals("São_Tomé_and_Príncipe")) {
        	  String São_Tomé_and_Príncipemsg = "";
        	  sendText(chat_id, São_Tomé_and_Príncipemsg);
          							}
          
          if (call_data.equals("Saudi_Arabia")) {
        	  String Saudi_Arabiamsg = "";
        	  sendText(chat_id, Saudi_Arabiamsg);
          							}
          
          if (call_data.equals("Senegal")) {
        	  String Senegalmsg = "";
        	  sendText(chat_id, Senegalmsg);
          							}
          
          if (call_data.equals("Serbia")) {
        	  String Serbiamsg = "";
        	  sendText(chat_id, Serbiamsg);
          							}
          
          if (call_data.equals("Seychelles")) {
        	  String Seychellesmsg = "";
        	  sendText(chat_id, Seychellesmsg);
          							}
          
          if (call_data.equals("Sierra_Leone")) {
        	  String Sierra_Leonemsg = "";
        	  sendText(chat_id, Sierra_Leonemsg);
          							}
          
          if (call_data.equals("Singapore")) {
        	  String Singaporemsg = "";
        	  sendText(chat_id, Singaporemsg);
          							}
          
          if (call_data.equals("Slovakia")) {
        	  String Slovakiamsg = "";
        	  sendText(chat_id, Slovakiamsg);
          							}
          
          if (call_data.equals("Slovenia")) {
        	  String Sloveniamsg = "";
        	  sendText(chat_id, Sloveniamsg);
          							}
          
          if (call_data.equals("Solomon_Islands")) {
        	  String Solomon_Islandsmsg = "";
        	  sendText(chat_id, Solomon_Islandsmsg);
          							}
          
          if (call_data.equals("Somalia")) {
        	  String Somaliamsg = "";
        	  sendText(chat_id, Somaliamsg);
          							}
          
          if (call_data.equals("South_Africa")) {
        	  String South_Africamsg = "";
        	  sendText(chat_id, South_Africamsg);
          							}
          
          if (call_data.equals("South_Sudan")) {
        	  String South_Sudanmsg = "";
        	  sendText(chat_id, South_Sudanmsg);
          							}
          
          if (call_data.equals("Spain")) {
        	  String Spainmsg = "";
        	  sendText(chat_id, Spainmsg);
          							}
          
          if (call_data.equals("Sri_Lanka")) {
        	  String Sri_Lankamsg = "";
        	  sendText(chat_id, Sri_Lankamsg);
          							}
          
          if (call_data.equals("Sudan")) {
        	  String Sudanmsg = "";
        	  sendText(chat_id, Sudanmsg);
          							}
          
          if (call_data.equals("Suriname")) {
        	  String Surinamemsg = "";
        	  sendText(chat_id, Surinamemsg);
          							}
          
          if (call_data.equals("Sweden")) {
        	  String Swedenmsg = "";
        	  sendText(chat_id, Swedenmsg);
          							}
          
          if (call_data.equals("Switzerland")) {
        	  String Switzerlandmsg = "";
        	  sendText(chat_id, Switzerlandmsg);
          							}
          
          if (call_data.equals("Syria")) {
        	  String Syriamsg = "";
        	  sendText(chat_id, Syriamsg);
          							}
          
          if (call_data.equals("Saint_Martin")) {
        	  String Saint_Martinmsg = "";
        	  sendText(chat_id, Saint_Martinmsg);
          							}
          
          if (call_data.equals("Sint_Maarten")) {
        	  String Sint_Maartenmsg = "";
        	  sendText(chat_id, Sint_Maartenmsg);
          							}
          
          if (call_data.equals("Tajikistan")) {
        	  String Tajikistanmsg = "";
        	  sendText(chat_id, Tajikistanmsg);
          							}
          
          if (call_data.equals("Tanzania")) {
        	  String Tanzaniamsg = "";
        	  sendText(chat_id, Tanzaniamsg);
          							}
          
          if (call_data.equals("Thailand")) {
        	  String Thailandmsg = "";
        	  sendText(chat_id, Thailandmsg);
          							}
          
          if (call_data.equals("Togo")) {
        	  String Togomsg = "";
        	  sendText(chat_id, Togomsg);
          							}
          
          if (call_data.equals("Tonga")) {
        	  String Tongamsg = "";
        	  sendText(chat_id, Tongamsg);
          							}
          
          if (call_data.equals("Trinidad_and_Tobago")) {
        	  String Trinidad_and_Tobagomsg = "";
        	  sendText(chat_id, Trinidad_and_Tobagomsg);
          							}
          
          if (call_data.equals("Tunisia")) {
        	  String Tunisiamsg = "";
        	  sendText(chat_id, Tunisiamsg);
          							}
          
          if (call_data.equals("Turkey")) {
        	  String Turkeymsg = "";
        	  sendText(chat_id, Turkeymsg);
          							}
          
          if (call_data.equals("Turkmenistan")) {
        	  String Turkmenistanmsg = "";
        	  sendText(chat_id, Turkmenistanmsg);
          							}
          
          if (call_data.equals("Tuvalu")) {
        	  String Tuvalumsg = "";
        	  sendText(chat_id, Tuvalumsg);
          							}
          
          if (call_data.equals("Uganda")) {
        	  String Ugandamsg = "";
        	  sendText(chat_id, Ugandamsg);
          							}
          
          if (call_data.equals("Ukraine")) {
        	  String Ukrainemsg = "";
        	  sendText(chat_id, Ukrainemsg);
          							}
          
          if (call_data.equals("United_Arab_Emirates")) {
        	  String United_Arab_Emiratesmsg = "";
        	  sendText(chat_id, United_Arab_Emiratesmsg);
          							}
          
          if (call_data.equals("United_Kingdom")) {
        	  String United_Kingdommsg = "";
        	  sendText(chat_id, United_Kingdommsg);
          							}
          
          if (call_data.equals("Uruguay")) {
        	  String Uruguaymsg = "";
        	  sendText(chat_id, Uruguaymsg);
          							}
          
          if (call_data.equals("Uzbekistan")) {
        	  String Uzbekistanmsg = "";
        	  sendText(chat_id, Uzbekistanmsg);
          							}
          
          if (call_data.equals("Vanuatu")) {
        	  String Vanuatumsg = "";
        	  sendText(chat_id, Vanuatumsg);
          							}
          
          if (call_data.equals("Vatican_City")) {
        	  String Vatican_Citymsg = "";
        	  sendText(chat_id, Vatican_Citymsg);
          							}
          
          if (call_data.equals("Venezuela")) {
        	  String Venezuelamsg = "";
        	  sendText(chat_id, Venezuelamsg);
          							}
          
          if (call_data.equals("Vietnam")) {
        	  String Vietnammsg = "";
        	  sendText(chat_id, Vietnammsg);
          							}
          
          if (call_data.equals("Wales")) {
        	  String Walesmsg = "";
        	  sendText(chat_id, Walesmsg);
          							}
          
          if (call_data.equals("Wallis_and_Futuna")) {
        	  String Wallis_and_Futunamsg = "";
        	  sendText(chat_id, Wallis_and_Futunamsg);
          							}
          
          if (call_data.equals("Western_Sahara")) {
        	  String Western_Saharamsg = "";
        	  sendText(chat_id, Western_Saharamsg);
          							}
          
          if (call_data.equals("Yemen")) {
        	  String Yemenmsg = "";
        	  sendText(chat_id, Yemenmsg);
          							}
          
          if (call_data.equals("Zambia")) {
        	  String Zambiamsg = "";
        	  sendText(chat_id, Zambiamsg);
          							}
          
          if (call_data.equals("Zimbabwe")) {
        	  String Zimbabwemsg = "";
        	  sendText(chat_id, Zimbabwemsg);
          							}
          
      }
  }
}
