package at.technikum.server.http;

import java.util.HashMap;

public class Response {

    private int statusCode;

    private String statusMessage;

    private String contentType;

    private String body;

    public void setStatus(HttpStatus httpStatus) {
        this.statusCode = httpStatus.getCode();
        this.statusMessage = httpStatus.getMessage();
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(HttpContentType httpContentType) {
        this.contentType = httpContentType.getMimeType();
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    public Response getResponse(String msg, int err){
        Response response = new Response();
        switch (err) {
            case 200:
                response.setStatus(HttpStatus.OK);
                break;
            case 400:
                response.setStatus((HttpStatus.BAD_REQUEST));
                break;
            case 401:
                response.setStatus((HttpStatus.UNAUTHORIZED));
        }
        response.setContentType(HttpContentType.APPLICATION_JSON);
        response.setBody(msg);
        return response;
    }

    public Response getError(){
        Response response = new Response();
        response.setContentType(HttpContentType.APPLICATION_JSON);
        response.setBody("Sorry, something went wrong on our side.");
        response.setStatus((HttpStatus.SERVER_ERROR));
        return response;
    }

    public String mapToString(HashMap<String, String> map) {
        StringBuilder result = new StringBuilder();

        map.forEach((key, value) -> result.append(key)
                .append(": ")
                .append(value)
                .append(", "));

        // Entferne das letzte ", " am Ende des Strings
        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }

        return result.toString();
    }
}
