FROM ruby:3.3.3-alpine3.19 
WORKDIR /home/ruby/app
RUN apk add --no-cache build-base
COPY Gemfile .
RUN bundle install
COPY app.rb .
EXPOSE 4567
CMD ["ruby", "app.rb", "-o", "0.0.0.0"]
