#!/bin/sh
docker run -v $(pwd):/app -p 8080:8080 --network=api sbapi-dev