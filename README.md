# tatsam
This Project is meant for the tatsam hiring process, I've used MongoDB as the database.

here are all the Curls

/priority --get Request Returns a list of all the priority areas from the database

/priority --post Request add more areas in the backend.

curl --request POST \
  --url http://localhost:8080/priority \
  --header 'Content-Type: application/json' \
  --cookie JSESSIONID=46BDA0BA8947B24E85FB943A58666684 \
  --data '{
	"id" : 1,
	"priorityArea" : "Connection"
}'


/user --get Request to return all the users and their order of priority and satisfaction rating.

/user --post Requset 

curl --request POST \
  --url http://localhost:8080/user \
  --header 'Content-Type: application/json' \
  --cookie JSESSIONID=46BDA0BA8947B24E85FB943A58666684 \
  --data '{
	"id" : 1,
	"userId" : "g178282",
	"preferences" : [
		{
			"priorityName" : "Career",
			"priorityLevel" : 10,
			"satisfaction" : 5
		},
			{
			"priorityName" : "Connection",
				"priorityLevel" : 8,
			"satisfaction" : 4
		}
	]
}'

- Accepts the order of priority along with the satisfaction rating for each area for a user and stores it in the database
