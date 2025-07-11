# General Questions
curl --get --data-urlencode "message=Can you tell me a joke?" http://localhost:8080/chatbot/generate; echo;
curl --get --data-urlencode "message=Can you tell me a small story?" http://localhost:8080/chatbot/generate; echo;

# Intermediate Questions
curl --get --data-urlencode "message=How to make a phone call?" http://localhost:8080/chatbot/generate; echo;
curl --get --data-urlencode "message=How to make coffee?" http://localhost:8080/chatbot/generate; echo;
curl --get --data-urlencode "message=How to drive a car?" http://localhost:8080/chatbot/generate; echo;

# Historical Questions
curl --get --data-urlencode "message=Do you know how is the US president in 2025?" http://localhost:8080/chatbot/generate; echo;
curl --get --data-urlencode "message=As an AI model, what is your latest knowledge cutoff?" http://localhost:8080/chatbot/generate; echo;
curl --get --data-urlencode "message=Can you tell me who won the Super Bowl in 2020?" http://localhost:8080/chatbot/generate; echo;

